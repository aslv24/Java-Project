package com.java.arrayDemo;

public class ArrayDemo {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		int m=10;

		// Declaration
		int[] arrayName1;
		int []arrayName2;
		int arrayName3[];  // (valid, but less preferred)
		
		//Creation
		
		int a[]=new int[5];//using new keyword
		
		a[0]=1;
		
		a[1]=2;
		
		a[2]=3;
		
		a[3]=4;
		
		a[4]=5;
		
		int n[]=new int[] {1,2,3,4,5,6,7,8,9,10};//using new keyword
		
		int b[]= {
				1,3,
				2,
				3,
				4,
				5,
				6,
				7,
				8
				};//array literal
		
		System.out.println(m);
		
		System.out.println(b.length);
		
		for(int i=b.length-1; i>=0;i--)
		{
		System.out.println(b[i]);
		}
		
		System.out.println("=======================");
		
		for(int bb:b)
		{
		System.out.println(bb);
		}

	}

}
