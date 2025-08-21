package com.java.StringDemo;

public class Namereverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="I am Fine";
		
		int size=name.length()-1;
		
		for(int i=0;i<=size ;i++)
		{
		System.out.print(name.charAt(i));
		}
		System.out.println();
		
		System.out.println("=========================================");
		
		for(int i=size;i>=0 ;i--)
		{
		System.out.print(name.charAt(i));
		}
		System.out.println();
	}

}
