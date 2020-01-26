package com.rk.currencyexchange.model;

import java.math.BigDecimal;

public class ExchangeValue {
	
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionMuttiple;
	
	
	
	protected ExchangeValue() {
		super();
	}
	public ExchangeValue(Long id, String from, String to, BigDecimal conversionMuttiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMuttiple = conversionMuttiple;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionMuttiple() {
		return conversionMuttiple;
	}
	public void setConversionMuttiple(BigDecimal conversionMuttiple) {
		this.conversionMuttiple = conversionMuttiple;
	}
	
	
	

}
