package com.dtweb.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dtweb.model.Customer;
import com.dtweb.services.CustomerService;


/**
 * @author Thong
 * Class LoginController implements Login functions.
 *
 */

@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	CustomerService customService;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String showForm(Map<String, Object> model) {
		Customer c = new Customer();
		model.put("customer", c);
		return "login";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String processForm(@Validated Customer custom, BindingResult result,
			Map<String, Object> model, HttpSession session) {
		
		if (result.hasErrors()) {
			return "login";
		}
		
		Customer c = (Customer) model.get("customer");
		
		if (customService.checkCustomer(c)) {
			session.setAttribute("user", customService.findByUsername(c.getUsername()));			
			return "index";
		}
		
		return "login";
	}

}
