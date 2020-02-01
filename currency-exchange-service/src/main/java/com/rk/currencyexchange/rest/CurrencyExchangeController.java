package com.rk.currencyexchange.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rk.currencyexchange.model.ExchangeValue;
import com.rk.currencyexchange.repository.ExchangeValueRepository;

@RestController
public class CurrencyExchangeController {
	private Logger logger=LoggerFactory.getLogger(this.getClass());
    @Autowired
	Environment env;
	@Autowired
    ExchangeValueRepository repository; 
  	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrivewExchangeValue(@PathVariable String from,@PathVariable String to) {
		ExchangeValue exchange= repository.findByFromAndTo(from, to);
		logger.info("{}",exchange);
		System.out.println("Exchange:="+exchange);
		 exchange.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		 return exchange;
		
	}

}
