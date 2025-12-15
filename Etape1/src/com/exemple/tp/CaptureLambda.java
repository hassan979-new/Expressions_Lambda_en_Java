package com.exemple.tp;

import java.util.function.IntUnaryOperator;

public class CaptureLambda {
	private int valeur = 100;

	private void demothis() {
		Runnable r = () -> {
			System.out.println("Valeur Capturée: " + this.valeur);
		};
		r.run();
	}

	public static void main(String[] args) {
		int facteur = 10;

		IntUnaryOperator multiplicateur = n -> n * facteur;

		System.out.println("5 * " + facteur + " = " + multiplicateur.applyAsInt(5));

		new CaptureLambda().demothis();
	}
}
