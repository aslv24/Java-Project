package com.java.oops.inheritDemo;

public class ChildB extends ParentA{
	
	String name;
	
	public static void cb1()
	{
		
	}

	public void cb2()
	{
		String name="admin";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildB.cb1();
		
		new ChildB().cb2();
		
		ChildB.m1();
		
		new ChildB().m2();

	}

}
