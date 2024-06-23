package com.springcore.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext con;

	public static void main(String[] args) {
		con = new ClassPathXmlApplicationContext("com/springcore/Annotation/My.xml");
		Student student = con.getBean("student",Student.class);
//		System.out.println(student);
		
		// we are used the singleton for that we can ibtain the same valkue after call one by another
		
		System.out.println(student.hashCode());
		 Student student1 = con.getBean("student",Student.class);
		 System.out.println(student1.hashCode());

	}

}
