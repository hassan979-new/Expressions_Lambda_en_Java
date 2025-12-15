package com.exemple.tp;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfacesFonctionnelles {
	public static void main(String[] args) {
		Predicate<String> estValise = s -> s.isEmpty();
		System.out.println(("La chaîne est vide: " + estValise.test("")));
		System.out.println(("La chaîne est vide: " + estValise.test("Hassan")));
		
		Consumer<String> afficheur = s -> System.out.println("Afficher: "+s);
		afficheur.accept("Hello world!");
		
		Function<String, Integer> longeur = s -> s.length();
		System.out.println("Longueur: " + longeur.apply("Agouram"));
		
		Supplier<Double> nombreAleatoire = () -> Math.random();
		System.out.println("Nombre aléatoire: " + nombreAleatoire.get());
	}
}
