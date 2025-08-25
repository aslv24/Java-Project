package com.java.collection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Object> set=new HashSet<Object>();
		set.add("java");
		set.add(2346);
		set.add(true);
		set.add(4.123F);
		set.add(894578365824L);
		set.add('s');
		set.add("selenium");
		set.add(234);
		set.add(123);
		set.add(13123);
		set.add(123);
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(123);
		set.add(123);
		set.add(123);
		set.add(null);
		System.out.println(set);
		set.remove("selenium");
		System.out.println(set);
		
		Iterator<Object> i = set.iterator();
		
		while(i.hasNext())//1 2 3 4 5 6 7 8 9 10
		{
			System.out.println(i.next());
		}
		
	}

}
