package com.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.service.CartridgeService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class CartridgeController {

	@Autowired
	private CartridgeService service;

	
	@RequestMapping(value = "/formCartridge", method = RequestMethod.GET)
	public String formCompany() {
		return "add-form-cartridge";
	}
	

	@RequestMapping(value = "/showAllCartridge", method = RequestMethod.GET)
	public String showAllCartridge() {
		return "view-all-cartridge";
	}


}
