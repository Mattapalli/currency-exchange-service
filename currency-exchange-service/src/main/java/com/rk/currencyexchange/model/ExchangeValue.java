package com.rk.currencyexchange.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class ExchangeValue {
	
	@Id
	private Long id;
	
	@Column(name="currency_from")
	private String from;
	
	@Column(name="currency_to")
	private String to;
	
	@Column(name="conversion_multiple")
	private BigDecimal conversionMuttiple;
	
	private int port;	
	
	
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
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	
	
	

}
