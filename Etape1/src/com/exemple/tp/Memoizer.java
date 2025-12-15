package com.exemple.tp;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class Memoizer {

	public static void main(String[] args) {

		// Version non-memoized
		Function<Integer, Long>[] fibonacci = new Function[1];
		fibonacci[0] = n -> {
			if (n <= 1)
				return (long) n;
			System.out.println("Calcul de fibonacci(" + n + ")");
			return fibonacci[0].apply(n - 1) + fibonacci[0].apply(n - 2);
		};

		// Version memoized
		Function<Integer, Long>[] fibonacciMemoized = new Function[1];
		fibonacciMemoized[0] = memoize(n -> {
			if (n <= 1)
				return (long) n;
			System.out.println("Calcul de fibonacci(" + n + ")");
			return fibonacciMemoized[0].apply(n - 1) + fibonacciMemoized[0].apply(n - 2);
		});

		System.out.println("Version non-memoized:");
		long start = System.currentTimeMillis();
		System.out.println("fibonacci(10) = " + fibonacci[0].apply(10));
		System.out.println("Temps: " + (System.currentTimeMillis() - start) + "ms");

		System.out.println("\nVersion memoized:");
		start = System.currentTimeMillis();
		System.out.println("fibonacci(10) = " + fibonacciMemoized[0].apply(10));
		System.out.println("Temps: " + (System.currentTimeMillis() - start) + "ms");

		System.out.println("\nDeuxième appel memoized:");
		start = System.currentTimeMillis();
		System.out.println("fibonacci(10) = " + fibonacciMemoized[0].apply(10));
		System.out.println("Temps: " + (System.currentTimeMillis() - start) + "ms");
	}

	public static <T, R> Function<T, R> memoize(Function<T, R> function) {
		Map<T, R> cache = new ConcurrentHashMap<>();
		return input -> cache.computeIfAbsent(input, function);
	}
}
