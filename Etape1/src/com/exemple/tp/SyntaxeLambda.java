package com.exemple.tp;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class SyntaxeLambda {
	public static void main(String[] args) {
		Runnable r1 = () -> System.out.println("Hello");

		Consumer<String> c1 = s -> System.out.println(s);
		Consumer<String> c2 = (String s) -> System.out.println(s);

		BiFunction<String, String, String> concat = (s1, s2) -> s1 + s2;

		BiFunction<Integer, Integer, Integer> max = (a, b) -> {
			if (a > b) {
				return a;
			} else {
				return b;
			}
		};

		r1.run();
		c1.accept("Lambda Simple");
		c2.accept("Lambda avec tupe explicite");
		System.out.println("Concaténation: " + concat.apply("Hassan", " Agouram"));
		System.out.println("Maximum entre 10 et 5: " + max.apply(10, 5));
	}
}
