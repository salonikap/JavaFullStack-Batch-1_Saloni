package com.tms.java8;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionDemo4 {
	
	public static void main(String[] args) {
		Consumer<Integer> consumer=(a)->System.out.println("square of given number:"+(a*a));
		consumer.accept(3);
		Consumer<Double> cons1=(a)->System.out.println("discount of 10%r:"+(a*0.10));
		cons1.accept(960000.00);
		Consumer<String> con2=(name)->System.out.println(name.toUpperCase());
		con2.accept("verizon associate");
		Supplier<Integer> s1=()->new Random().nextInt(100);
		System.out.println(s1.get());
		Predicate<Integer> p=(a)->a%2==0;
		System.out.println(p.test(3));
		System.out.println(p.test(9));
		Function<Integer,Integer> f=(a)->a*a*a;
		System.out.println(f.apply(5));
		Function<String,Integer> f1=(s)->Integer.parseInt(s);
		System.out.println(f1.apply("20")+2);
	}

}
