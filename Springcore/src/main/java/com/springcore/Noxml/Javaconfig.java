package com.springcore.Noxml;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.springcore.Javaconfig")
@Configuration
public class Javaconfig {
	public Student getStudent() {
		Student student = new Student();
		return student;
	}

}
