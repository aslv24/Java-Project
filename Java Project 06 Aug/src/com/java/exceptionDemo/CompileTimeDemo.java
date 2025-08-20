package com.java.exceptionDemo;

public class CompileTimeDemo {
	
	
	public static void m1() throws InterruptedException
	{
		System.out.println(1);
		Thread.sleep(2000);
		System.out.println(2);
		Thread.sleep(2000);
		System.out.println(3);
		Thread.sleep(2000);
		System.out.println(4);
		Thread.sleep(2000);
		System.out.println(5);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		m1();
		
		
		
	}

}
