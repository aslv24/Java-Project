package com.java.exceptionDemo;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6,7};
		
		int b=0;
		
		try {
		System.out.println(a[4]/b);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divided by zero");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("This is array size :: "+a.length);
			System.err.println("Please check the argument value");
		}
		catch(Exception e)
		{
			System.err.println("UnDefined Exception");
		}
		
	}

}
