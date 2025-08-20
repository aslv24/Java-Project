package com.java.basics;

public class Demo {
	
	static String trainerName;

	// static method
	public static void m1() {

		System.out.println(trainerName);
	}

	// instance method
	public void m2() {

		System.out.println(trainerName);
	}
	
	{
		trainerName="logesh";
	}

	// constructor
	public Demo() {
		System.out.println("I am constructor");
		
	}

	public static void main(String[] args) {

		Demo.m1();
		
		new Demo().m2();
	}
}
