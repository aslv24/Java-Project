package com.java.StringDemo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="Java";//Object Creation
		
		String str2="java";//Object Creation
		
		System.out.println(str1.length());
		
		System.out.println(str1.toUpperCase());
		
		System.out.println(str1.toLowerCase());
		
		System.out.println(str1.concat(" program"));
		
		System.out.println(str1.hashCode());
		
		System.out.println(str2.hashCode());
		
		System.out.println(str1.startsWith("jv"));
		
		System.out.println(str1.contains("v"));
		
		System.out.println(str1.endsWith("a"));
		
		System.out.println(str1.equals("java"));
		
		System.out.println(str1.equalsIgnoreCase("java"));
		
		System.out.println(str1.replace('a','e'));
		
		System.out.println(str1.indexOf('a'));
		
		System.out.println(str1.lastIndexOf('a'));
		
		System.out.println(str1.charAt(0));
		
		System.out.println(str1);
	}

}
