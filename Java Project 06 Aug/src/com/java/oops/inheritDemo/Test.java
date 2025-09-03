package com.java.oops.inheritDemo;

public class Test extends Demo{

	
	public static void add()
	{
		System.out.println("I am Add Method");
	}
	
	public  void sub()
	{
		super.m2();
		System.out.println("I am Sub Method");
	}
	
	public Test() {
		this(234);
		System.out.println("I am Child Class Constructor");
	}
	
	public Test(int a) {
		super();
		System.out.println("I am Child Class int Constructor");
		
	}
	
	public static void main(String[] args) {

		new Test();
	}

}
