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

import com.spring.domain.Cartridge;
import com.spring.domain.Company;
import com.spring.service.CartridgeService;
import com.spring.service.CompanyService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class CartridgeController {

	@Autowired
	private CartridgeService service;
	
	@Autowired
	private CompanyService compService;

	
	@RequestMapping(value = "/formCartridge")
	public String formCompany(Model model) throws SQLException {
		List<Company> listCompany =compService.findAll();
		model.addAttribute("listCompany", listCompany);
		return "add-form-cartridge";
	}
	
	/*
	
	@RequestMapping(value = "/insertCompany", method = RequestMethod.POST)
	public String insertCompany(Model model,
			@RequestParam(value = "companyId") String companyId,
			@RequestParam(value = "type") String type )			
					throws SQLException {
		Cartridge cart = new Cartridge();
		cart.setTypeCartridge(type);
		cart.setCompany(compService.findById(companyId));
		
		service.insert(cart);
		return "redirect:/formCartridge";
	}
	*/

	@RequestMapping(value = "/showAllCartridge")
	public String showAllCartridge(Model model) throws SQLException {
		List<Cartridge> cartridges =service.findAll();
		model.addAttribute("cartridges", cartridges);
		return "view-all-cartridge";
	}


}
