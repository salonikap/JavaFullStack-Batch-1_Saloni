package com.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ListDemo {

	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(23);
		l.add(234.56);
		l.add("length");
		l.add(23);
		l.add(67);
	    l.add("java");
	    l.add(LocalDate.now());
	    System.out.println();
	    System.out.println(l.size());
	    l.remove(2);
	    System.out.println(l.contains("length"));
	    System.out.println(l.indexOf("length"));
	    System.out.println(l.lastIndexOf("java"));
	    ArrayList a1=new ArrayList();
	    a1.add(46);
	    a1.add(56);
	    a1.add(76);
	    l.addAll(a1);
	    System.out.println(l);
	    System.out.println(l.containsAll(a1));
	    for(Object o:l)
	    {
	    	System.out.println(o);
	    }
	    Iterator i=l.iterator();
	    while(i.hasNext())
	    {
	    	System.out.println(i.next());
	    }
	    l.forEach(x->System.out.println(x));
	    
	}

}
