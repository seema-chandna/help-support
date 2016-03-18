package com.bsb.valise.helpSupport.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.bsb.valise.helpSupport.HelpSupportRepo;
import com.bsb.valise.helpSupport.dto.HelpSupportDto;

public class Application {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new ClassPathResource("resources/valise-servlet.xml").getPath());
		
		HelpSupportRepo supportDto=context.getBean(HelpSupportRepo.class);
		
		HelpSupportDto helpSupport1=new HelpSupportDto();
	}
}
