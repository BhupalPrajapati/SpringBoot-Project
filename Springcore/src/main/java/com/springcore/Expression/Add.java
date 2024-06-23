package com.springcore.Expression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Add {
	@Value("#{2+3}")
	
	private int x;
	@Value("#{10-3}")
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Add [x=" + x + ", y=" + y + "]";
	}
	public Add() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
