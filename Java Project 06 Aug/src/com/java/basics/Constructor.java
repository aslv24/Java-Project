package com.java.basics;

public class Constructor {
	
	
	public Constructor() {
		this(564);
		System.out.println("Common Method");
		
		
	}
	
	public Constructor(int a) {
		System.out.println("Int Common Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Constructor();
		
		
	}

}
