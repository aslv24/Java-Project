package com.java.basics;

public class Sample {
	
	
	
	public static void m1()
	{
		System.out.println(2635);
	}
	
	public void m2()
	{
		System.out.println(2635.353f);
	}
	
	public void m3()
	{
		System.out.println(2635247386423L);
	}
	
	public void m4()
	{
		System.out.println('s');
	}
	
	public static void m5()
	{
		System.out.println(true);
	}

	public static void m6()
	{
		System.out.println("Hello World");
	}
	

	public static void main(String[] args) {

		Sample.m1();
		
		Sample sample=new Sample();//variable int a=10;
		
		sample.m2();
		
		sample.m3();
		
		sample.m4();
		
		Sample.m5();
		

	}
}
