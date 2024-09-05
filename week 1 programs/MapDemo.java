package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map=new TreeMap <>();//TreeMap,HashMap,LinkedHashMap
		map.put(1, "java2");
		map.put(4, "java");
		map.put(8, "jav3");
		map.put(2, "jav4");
		map.put(7, "jav7");
		map.put(8, "jav3");
		map.put(8, "sql");
		
		System.out.println(map);
		Set Keys=map.keySet();
		System.out.println(Keys);
		Collection values=map.values();
		System.out.println(values);
		Set kvset=map.entrySet();
		Iterator i=kvset.iterator();
		while(i.hasNext()) {
			Map.Entry entry=(Map.Entry)i.next();
			System.out.println(entry.getKey() +" "+ entry.getValue());
		}
		
	}

}
