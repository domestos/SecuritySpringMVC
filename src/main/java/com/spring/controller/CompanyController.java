package com.spring.controller;

import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.spring.domain.Company;
import com.spring.service.CompanyService;

@Controller
public class CompanyController {

	@Autowired
	private CompanyService service;

	@RequestMapping(value = "/formCompany")
	public String fromCompanu() {
		return "add-form-company";
	}

	@RequestMapping(value = "/insertCompany", method = RequestMethod.POST)
	public String insertCompany(Model model, @RequestParam(value = "name") String name,
			@RequestParam(value = "phone") String phone, @RequestParam(value = "email") String email)
					throws SQLException {
		Company comp = new Company(name, phone, email);
		service.insert(comp);
		return "redirect:/formCompany";
	}

	@RequestMapping(value = "/showAllCompany")
	public String showAllCompany(Model model) throws SQLException {

		List<Company> listCompany = service.findAll();
		model.addAttribute("view-all-company", listCompany);
		return "view-all-company";
	}

}
