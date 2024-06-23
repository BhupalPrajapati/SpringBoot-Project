package com.springcore.Noxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(Javaconfig.class);
		Student s = context.getBean("student",Student.class);
		System.out.println(s);
		s.study();
		

	}

}
