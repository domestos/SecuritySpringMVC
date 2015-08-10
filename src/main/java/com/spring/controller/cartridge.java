package com.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class cartridge {

	private static final Logger logger = LoggerFactory.getLogger(company.class);

	@RequestMapping(value = "/formCartridge", method = RequestMethod.GET)
	public String fromCompanu() {
		return "add-form-cartridge";
	}

}
