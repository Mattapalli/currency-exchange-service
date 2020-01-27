package com.rk.currencyexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rk.currencyexchange.model.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue,Long> {
	
	ExchangeValue findByFromAndTo(String from,String to);
	

}
