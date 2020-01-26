package com.rk.currencyexchange.rest;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rk.currencyexchange.model.ExchangeValue;

@RestController
public class CurrencyExchangeController {
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrivewExchangeValue(@PathVariable String from,@PathVariable String to) {
		return new ExchangeValue(100l,from, to,  BigDecimal.valueOf(65));
		
	}

}
