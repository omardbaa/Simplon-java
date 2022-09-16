package soussHealthOnlineStore.controllers;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;
import soussHealthOnlineStore.entities.AppRole;
import soussHealthOnlineStore.entities.Users;
import soussHealthOnlineStore.security.JWTUtil;
import soussHealthOnlineStore.services.AuthenticationServiceImpl;
import soussHealthOnlineStore.services.UsersServiceImpl;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/auth")
public class AuthController {
	

	@Autowired
	UsersServiceImpl userService;

	@Autowired
	AuthenticationServiceImpl service;

	@GetMapping("/")

	public String Home() {
		return ("<h1>Welcom to soussHealthOnlineStore<h1>");
	}
	
	   @PostMapping("/register")
	    public String register(@RequestBody Users user) {
		   System.out.println(user);
	        service.registerDefaultUser(user);
	         
	        return "register success";
	    }
	
	@PostMapping("/save")
public Users save(@RequestBody Users users  ) {
		userService.save(users);
		return users;
	}
	

	@GetMapping("/users")
//	@PostAuthorize("hasAuthority('ADMIN')")
	public List<Users> list(){
		return userService.getAll();
		
	}
	
	@PostMapping(path = "role/save")
	@PostAuthorize("hasAuthority('ADMIN')")
	public AppRole saveRole(@RequestBody AppRole appRole) {
		service.save(appRole);
		return appRole;
	}
	
	@PostMapping(path = "/roleToUser")
	@PostAuthorize("hasAuthority('ADMIN')")
public void addRoleToUser(@RequestBody RoleUserForm roleUserForm ) {
		
		service.addRoleToUser(roleUserForm.getUsername(),roleUserForm.getRoleName());
	}
	
	
	@GetMapping(path = "/refreshToken")
	public void refreshToken(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		String authToken = request.getHeader(JWTUtil.HEADER);
		if(authToken!=null && authToken.startsWith(JWTUtil.PREFIX)) {
			
			try {
				
				String refreshToken = authToken.substring(JWTUtil.PREFIX.length());
				Algorithm algorithm = Algorithm.HMAC256(JWTUtil.SECRET);
				JWTVerifier jwtVerifier = JWT.require(algorithm).build();
				DecodedJWT decodedJWT = jwtVerifier.verify(refreshToken);
				String username = decodedJWT.getSubject();
				Users user = userService.loadUserByUserName(username);
				String jwtAccessToken = JWT.create()
						.withSubject(user.getUsername())
						.withExpiresAt(new Date(System.currentTimeMillis()+JWTUtil.EXPIRE_ACCESS_TOKEN))
						.withIssuer(request.getRequestURI().toString())
						.withClaim("roles", user.getAppRoles().stream().map(r->r.getRoleName()).collect(Collectors.toList()))
						.sign(algorithm);
				 
				Map<String,String> idToken = new HashMap<>();
				idToken.put("access-token", jwtAccessToken);
				idToken.put("refresh-token", refreshToken);
				response.setContentType("application/json");
				new ObjectMapper().writeValue(response.getOutputStream(), idToken);
				
			} catch (Exception e) {
//				response.setHeader("error-message", e.getMessage());
//				response.sendError(HttpServletResponse.SC_FORBIDDEN);
				throw e;
			}
		}else {
			throw new RuntimeException("Refresh Token required!!");
		}
	}
}




@Data
class RoleUserForm {
	private String username;
	private String roleName;
}
	

