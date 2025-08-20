package com.java.basics;

public class MethodDemo {

	public static int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public static int sub(int a, int b) {
		int c = b - a;
		return c;
	}	
	
	public static MethodDemo m1()
	{
		return new MethodDemo();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodDemo m1 = m1();
		
		int addAValue=125;
		int addBValue=125;

		int addValue = add(addAValue, addBValue);

		int subValue = sub(300, 200);

		int total = addValue + subValue;

		System.out.println("This is Value of add Method :: "+addValue);

		System.out.println("This is Value of sub Method :: "+subValue);

		System.out.println("This is Sum Value of add & sub Method :: "+total);

	
	}

}
