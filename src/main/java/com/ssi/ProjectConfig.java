package com.ssi;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.ssi")
public class ProjectConfig {

	//@Bean (initMethod="abc")
	//@Scope("singleton")
	//@Lazy
	//@Bean(autowire=Autowire.BY_TYPE)
	@Bean
	public Emp emp1() {
		Emp e=new Emp(); 
		e.setCode(111);
		e.setName("ABCD");
		//e.setAddress(adr1());
		return e;
	}
	
	@Bean
	public Address address() {
		Address ad=new Address();
		ad.setHno(5001);
		ad.setStreet("Xyz Street");
		ad.setCity("Indore");
		return ad;
	}
	
	
	
	
}
