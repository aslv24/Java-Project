package com.java.basics;

public class Variable {
	
	 String message="Thanks for using our app";
	
	public static void add()
	{
		int a=10;
		int b=20;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		System.out.println(new Variable().message);
	}
	
	public static void sub()
	{
		int a=200;
		int b=100;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a-b);
		System.out.println(new Variable().message);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add();
		sub();
		
	}

}
