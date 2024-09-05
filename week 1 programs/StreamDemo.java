package com.tms.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(3,4,5,6,50,40,78,96,34,45);
		list.forEach(x->System.out.print(x+" "));
	//sort,filter,limit,square
		System.out.println();
		list.stream().sorted().filter(x->x<=8).limit(2).forEach(x->System.out.println(x+" "));
		System.out.println();
		Optional<Integer> max=list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst();
		System.out.println();
		if(max.isPresent())
			System.out.println("max:"+max.get());
		String s=null;
		Optional<String> s1=Optional.ofNullable(null);
		if(s1.isPresent())
			System.out.println(s1.get());
		else
			System.out.println("empty");
		List<Integer> n1=Arrays.asList(10,20,42,46);
		List<Integer> n12=n1.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		n12.forEach(System.out::println);
		n1.stream().distinct().forEach(x->System.out.print(x+" "));
		long c =n1.stream().filter(x->x<50).count();
		System.out.println();
		System.out.println(c);
	}

}
