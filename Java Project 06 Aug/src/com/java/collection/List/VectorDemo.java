package com.java.collection.List;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b=100;

		Vector<Object> list=new Vector<Object>();
		
		list.add(true);
		
		list.add(null);
		
		list.add(null);
		
		list.add(2563);
		
		list.add(2438927483364L);
		
		list.add(835.347F);
		
		list.add('s');
		
		list.add("java");
		
		list.add('s');
		
		list.add('s');
		
		list.add("java");
		
		list.add('s');
		
		list.add('s');
		
		list.add(null);
		
		list.add(null);
		
		System.out.println(list);
		
		list.add(0,b);
		
		System.out.println(list);
		
		list.remove(7);
		
		System.out.println(list);
		
		System.out.println(list.get(10));
		
		System.out.println("===============================");
		
		Enumeration<Object> e = list.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}

}
