package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmpUser {

	public static void main(String[] args) {

		
		//ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Working With Java Conf.....");
		ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
		Emp e1=context.getBean("emp1",Emp.class);
		//Emp e2=context.getBean("emp1",Emp.class);
		System.out.println(e1);
		//System.out.println(e2);
		
		
	}

}
