package com.tyss.retailermanagement.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.tyss.retailermanagement.dto.ProductBean;
import com.tyss.retailermanagement.dto.RetailerBean;
import com.tyss.retailermanagement.service.RetailerService;

@Controller
public class RetailerController {


	@Autowired
	private RetailerService service ;
	
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}//end of login page
	
	@PostMapping("/login")
	public String login(int id,String password,
			HttpServletRequest request) {
		
		RetailerBean bean = service.login(id, password);
		if(bean==null) {
			request.setAttribute("msg", "Invalid Credentials");
			return "login";
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}
		
	}//end of login
	
	@GetMapping("/register")
	public String registerpage() {
		return "register";
	}
	
	@PostMapping("/register")
	public String register(RetailerBean bean,ModelMap map) {
		
		int check = service.register(bean);
		if(check>0) {
			map.addAttribute("msg", "You are registered"+check);
		}else {
			map.addAttribute("msg","Email is repeated");
		}
		
		return "login";
	}
	@GetMapping("/home")
	public String home(ModelMap map,
			@SessionAttribute(name = "bean",required = false)RetailerBean bean) {
		if(bean==null) {
			map.addAttribute("msg", "Login first");
			return "login";
		}else {
			
			return "home";
		}
		
	}//end of home
	
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}
	@PostMapping("/search")
	//to get the result @requestparam is used
	public String search(@RequestParam("id")int id,
			ModelMap map) {
		
		ProductBean bean = service.searchProduct(id);
		if(bean==null) {
			map.addAttribute("msg", "Data not found");
		}else {
			map.addAttribute("bean", bean);
		}
		return "home";
		
	}
	
	@GetMapping("/order")
	//to get the result @requestparam is used
	public String order() {
		
		
		return "order";
		
	}
	
}
