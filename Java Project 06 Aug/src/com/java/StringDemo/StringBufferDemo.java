package com.java.StringDemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer("java");//object creation
		
		System.out.println(sb.length());
		
		System.out.println(sb.equals("Java"));
		
		System.out.println(sb.lastIndexOf("a"));
		
		System.out.println(sb.append(" programming"));
		
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
		System.out.println(sb);
		

	}

}
