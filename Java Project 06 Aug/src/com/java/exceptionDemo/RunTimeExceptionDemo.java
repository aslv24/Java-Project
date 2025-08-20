package com.java.exceptionDemo;

public class RunTimeExceptionDemo {

	public static void main(String[] args) {

		int a = 10;

		int b = 10;

		try {
			System.out.println(a / b);
		}

		catch (ArithmeticException e) {
			System.out.println("Cannot divided by zero");
		}

		finally {
			System.out.println("Its always Executable");
		}

	}

}
