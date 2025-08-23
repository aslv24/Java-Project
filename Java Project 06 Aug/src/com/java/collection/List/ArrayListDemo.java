package com.java.collection.List;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b=100;

		ArrayList<Object> list=new ArrayList<Object>();
		
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
		
//		for(int i=0; i<list.size();i++)
//		{
//			System.out.println(list.get(i));
//		}
		
		for(Object aa:list)
		{
			System.out.println(aa);
		}
	}

}
