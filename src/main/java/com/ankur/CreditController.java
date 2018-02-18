package com.ankur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ankur.creditcard.model.CreditCard;
import com.ankur.creditcard.service.CreditCardService;

@RestController
@RequestMapping("/rest/user")
public class CreditController {

	@Autowired
	CreditCardService creditCardService;

	@GetMapping("/getByName/{name}")
	public CreditCard getUserByName(@PathVariable String name) {

		return creditCardService.findByName(name);
	}

	@GetMapping("/getById/{id}")
	public CreditCard getUserById(@PathVariable String id) {
		return creditCardService.findById(id);
	}

}
