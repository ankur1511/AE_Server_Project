package com.ankur.creditcard.service;

import com.ankur.creditcard.model.CreditCard;

public interface CreditCardService {

	CreditCard findByName(String name);

	CreditCard findById(String id);

}
