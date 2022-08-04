package GestionEmploye.controller;

import java.util.List;

import javax.management.RuntimeErrorException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import GestionEmploye.dao.EmployeeDao;
import GestionEmploye.model.Employe;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
public class EmployeeController {


private EmployeeDao employeDao;

@GetMapping(path = "/index")
public  String employe (Model model, 
		@RequestParam(name= " page",defaultValue = "0")int page,
		@RequestParam(name= " size",defaultValue = "5")int size,
	@RequestParam(name= " Keyword",defaultValue = "")String Keyword){
	
	Page<Employe> pageemploye=employeDao.findAll(PageRequest.of(page, size));
//	Page<Employe> pageemploye=employeDao.findByNomContains(Keyword, PageRequest.of(page, size));
	model.addAttribute("ListEmployees",pageemploye.getContent());
	model.addAttribute("pages", new int [pageemploye.getTotalPages()]);
	model.addAttribute("currentPage",page);
	model.addAttribute("Keyword",Keyword);
	
	return "Dashboard";
}

//@GetMapping("/employe/{id}")
//public Employe employe(@PathVariable Long id){
//	return employeDao.findById(id).get();
//}

@GetMapping("/delete")
public String  delete (Long id) {
	employeDao.deleteById(id);
//	return "redirect:/index?page=" +page+ "&Keyword="+ Keyword;
	return "redirect:/index";
}


@GetMapping("/edit")
public String  edit (Model model, Long id) {
	Employe employee=employeDao.findById(id).orElse(null);
	if (employee==null) throw new RuntimeException("Employee Not Exist");
	model.addAttribute("employee", employee );
	return "UpdateEmployee";
}


@GetMapping("/")
public String  Home () {
	return "Home";
}

@GetMapping("/NewEmployee")
public String  NewEmployee (Model model) {
	model.addAttribute("employee", new Employe());
	
return "NewEmployee";
}

@PostMapping (path="/save")
public String save(Model model, @Valid Employe employee , BindingResult bindingResult) {
	if(bindingResult.hasErrors()) return "NewEmployee";
	
	employeDao.save(employee);
	
	 return "redirect:/index";
	
	
}

}
