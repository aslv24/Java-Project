package com.java.oops.inheritDemo;

public class GrantChildC extends ChildB{
	
	public static void gc1()
	{
		
	}

	public void gc2()
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GrantChildC.cb1();//parent class
		
		new GrantChildC().cb2();//parent class
		
		GrantChildC.m1();//grant parent class
		
		new GrantChildC().m2();//grant parent class
		
		GrantChildC.gc1();//own class
		
		new GrantChildC().gc2();//own class
		
		

	}

}
