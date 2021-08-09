package com.fis.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		displayDate();
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