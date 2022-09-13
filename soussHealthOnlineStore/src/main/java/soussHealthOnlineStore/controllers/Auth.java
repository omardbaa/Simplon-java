//package soussHealthOnlineStore.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import soussHealthOnlineStore.security.entities.JwtRequest;
//import soussHealthOnlineStore.security.entities.JwtResponse;
//import soussHealthOnlineStore.security.jwt.JWTUtility;
//import soussHealthOnlineStore.security.jwt.UserService;
//
//@RestController
//@RequestMapping(value = "/auth")
//public class Auth {
//	
//	
//	
//	  @Autowired
//	    private JWTUtility jwtUtility;
//
//	    @Autowired
//	    private AuthenticationManager authenticationManager;
//
//	    @Autowired
//	    private UserService userService;
//
//	    @GetMapping ("/")
//		
//		public String Home () {
//			return ("<h1>Welcom to stcManger<h1>");
//		}
//	    
//	    @PostMapping("/authenticate")
//	    public JwtResponse authenticate(@RequestBody JwtRequest jwtRequest) throws Exception{
//
//	        try {
//	            authenticationManager.authenticate(
//	                    new UsernamePasswordAuthenticationToken(
//	                            jwtRequest.getUsername(),
//	                            jwtRequest.getPassword()
//	                    )
//	            );
//	        } catch (BadCredentialsException e) {
//	            throw new Exception("INVALID_CREDENTIALS", e);
//	        }
//
//	        final UserDetails userDetails
//	                = userService.loadUserByUsername(jwtRequest.getUsername());
//
//	        final String token =
//	                jwtUtility.generateToken(userDetails);
//
//	        return  new JwtResponse(token);
//	    }
//	
//	
//
//}
