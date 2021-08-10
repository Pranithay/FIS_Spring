package com.fis.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	String code;
	String name;
	public Country() {
		LOGGER.debug("Inside Country Constructor");

		
	}
	@Override
	public String toString() {
		return "country [code=" + code + ", name=" + name + "]";
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
