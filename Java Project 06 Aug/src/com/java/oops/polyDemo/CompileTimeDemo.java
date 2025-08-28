package com.java.oops.polyDemo;

public class CompileTimeDemo {
	
	public  void add()
	{
		System.out.println("For Add Function");
	}
	
	public  void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public  void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	public  void add(int a,float b)
	{
		System.out.println(a+b);
	}
	
	public  void add(float a,float b)
	{
		System.out.println(a+b);
	}
	
	public static void main()
	{
		
	}
	
	public static void main(int a)
	{
		
	}
	
	public static void main(String a)
	{
		
	}
	
	public static void main(int[] a)
	{
		
	}
	
	public static void main(float a)
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new CompileTimeDemo().add(1123,123,123);
	}

}
