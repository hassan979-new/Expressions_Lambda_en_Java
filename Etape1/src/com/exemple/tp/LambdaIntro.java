package com.exemple.tp;

@FunctionalInterface
interface Calculator {
	int calculer(int a, int b);
}

public class LambdaIntro {
	public static void main(String[] args) {
		Calculator addition = new Calculator() {

			@Override
			public int calculer(int a, int b) {
				return a + b;
			}
		};

		Calculator additionLambda = (a, b) -> a + b;

		System.out.println("Addition traditionnelle: " + addition.calculer(5, 3));
		System.out.println("Addition avec lambda: " + additionLambda.calculer(5, 3));
	}
}
