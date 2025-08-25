package com.java.collection.Set;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Object> set=new TreeSet<Object>();
		set.add(238746);
		set.add(2346);
		set.add(2);
		set.add(213);
		set.add(894);
		set.add(22);
		set.add(7856);
		set.add(234);
		set.add(123);
		set.add(13123);
		set.add(123);
		set.add(123);
		set.add(123);
		set.add(123);
		System.out.println(set);
		
		NavigableSet<Object> reversed = set.reversed();
		
		System.out.println(reversed);
		
		Iterator<Object> di = set.descendingIterator();
		
		while(di.hasNext())
		{
			System.out.println(di.next());
		}
	}

}
