package com.java.mapDemo;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer,Object> map=new LinkedHashMap<Integer,Object>();
		
		map.put(100, "raja");
		
		map.put(101, "logesh");
		
		map.put(131, "admin");
		
		map.put(11, "java");
		
		map.put(110, "selenium");
		
		map.put(null, "selenium");
		
		map.put(10, "maven");
		
		map.put(101, "testng");
		
		System.out.println(map);
		
		Set<Integer> keys = map.keySet();
		
		Collection<Object> values = map.values();
		
		Set<Entry<Integer, Object>> entires = map.entrySet();
		
		System.out.println(keys);
		
		System.out.println(values);
		
		System.out.println(entires);
		
	}

}
