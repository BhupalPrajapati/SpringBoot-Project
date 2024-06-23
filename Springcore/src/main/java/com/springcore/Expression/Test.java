package com.springcore.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.App;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/Expression/Add.xml");
		Add d = con.getBean("add",Add.class);
		System.out.println(d);
		

	}

}
