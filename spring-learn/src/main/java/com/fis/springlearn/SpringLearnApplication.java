package com.fis.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.springlearn.bean.Employee;

@SpringBootApplication
public class SpringLearnApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		displayDate();
		displayCountry();
		displayCountries();
		displayEmployee() ;
		
	}
	static void displayEmployee() {
		LOGGER.info("START");
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		Employee employee = context.getBean("employee", Employee.class);
		LOGGER.debug("Employee : {}", employee);
		LOGGER.info("END");
		
	}
	static void displayCountries() {
		LOGGER.info("Start");

		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		ArrayList<Country> countries=context.getBean("countryList",ArrayList.class);
		LOGGER.debug("Countries : {}", countries.toString());

		LOGGER.info("END");
		
	}
	static void displayCountry() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = (Country) context.getBean("country", Country.class);
		Country anotherCountry = context.getBean("country", Country.class);
		LOGGER.debug("Country : {}", country.toString());
		LOGGER.debug("Country : {}", anotherCountry.toString());


		
	}
	static void displayDate()  {
		 LOGGER.info("START");
		 ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		 SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		 SimpleDateFormat format1 = context.getBean("dateFormat1", SimpleDateFormat.class);
		  try {
			Date parseDate = format.parse("31/12/2018");
			Date parseDate1 = format1.parse("12/2/2018");
//			System.out.println(parseDate);
			LOGGER.debug(parseDate + "");
			LOGGER.debug(parseDate1 + "");

		} catch (ParseException e) {
			e.printStackTrace();
		}
		  LOGGER.info("END");
	}


}
