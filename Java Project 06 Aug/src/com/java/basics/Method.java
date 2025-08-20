package com.java.basics;

public class Method {

	public static void m1()
	{
		System.out.println("M1");
	}
	
	public static void m2()
	{
		m1();
		System.out.println("M2");
	}
	
	public void m3()
	{
		m2();
		System.out.println("M3");
	}
	
	public void m4()
	{
		this.m3();
		System.out.println("M4");
	}
	public static void main(String[] args) {
		
		new Method().m4();
		
		Method.m1();

	}
}
