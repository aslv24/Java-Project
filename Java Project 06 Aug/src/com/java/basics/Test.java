package com.java.basics;

public class Test
{
	public void m1(){
		System.out.println(1);
	}
	
	public void m2(){
		System.out.println(2);
	}
	
	public void m3(){
		System.out.println(3);
	}
	
	public void m4(){
		System.out.println(4);
	}
	
	
	public void m5(){
		System.out.println(5);
	}
	
	public void m6(){
		System.out.println(6);
	}
	
	public Test() {
		System.out.println("I am Constructor");
	}

	public static void main(String[] args) {
		
		Test test=new Test();//nameless Object t,obj,test
		
		test.m1();
		test.m2();
		test.m3();
		test.m4();
		test.m5();
		test.m6();
		
		
		
		
	}

}
