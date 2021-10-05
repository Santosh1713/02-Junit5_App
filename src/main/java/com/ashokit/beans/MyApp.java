package com.ashokit.beans;

public class MyApp {
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		Integer actualResult = cal.add(10, 20);
		System.out.println(actualResult);
	}

}
