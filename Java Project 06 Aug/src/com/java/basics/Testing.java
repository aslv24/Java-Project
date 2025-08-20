package com.java.basics;

public class Testing {

	public Testing() {
		System.out.println("I am No argument Constructor");
		
	}
	
	public Testing(int a) {
		this();
		System.out.println("I am int Constructor");
	}
	
	public Testing(float a) {
		this(2132);
		System.out.println("I am float Constructor");
	}
	
	public Testing(boolean a) {
		this(10.4546F);
		System.out.println("I am boolean Constructor");
	}
	
	public Testing(char a) {
		this(true);
		System.out.println("I am char Constructor");
	}
	
	public Testing(String a) {
		this('s');
		System.out.println("I am String Constructor");
	}
	
	public Testing(int a,int b) {
		this("");
		System.out.println("I am two argument int Constructor");
	}
	
	public Testing(int a,int b,int c) {
		this(10,27);
		System.out.println("I am three argument int Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Testing(875,654,653);
	}

}
