package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
	public static void main(String[] args)
	{
		Set<String> names=new TreeSet<>();
		names.add("jashu");
		names.add("kavi");
		names.add("anju");
		System.out.println(names);
		Set<Object> l=new TreeSet<>();//HashSet,LinkedHashSet,TreeSet
		l.add("23");
		l.add("44");
		l.add("23");
		l.add("55");
		System.out.println(l);
		Iterator i=l.iterator();
		while(i.hasNext())
		System.out.println(i.next());
		System.out.println("Lambda");
		l.forEach(x->System.out.println(x));
	}
}
