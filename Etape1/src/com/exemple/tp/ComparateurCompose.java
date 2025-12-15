package com.exemple.tp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Personne1 {
	private String nom;
	private String prenom;
	private int age;

	public Personne1(String prenom, String nom, int age) {
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return prenom + " " + nom + " (" + age + ")";
	}
}

public class ComparateurCompose {
	public static void main(String[] args) {
		List<Personne1> personnes = Arrays.asList(new Personne1("Jean", "Dupont", 30),
				new Personne1("Marie", "Martin", 25), new Personne1("Pierre", "Dupont", 40),
				new Personne1("Sophie", "Martin", 35), new Personne1("Paul", "Dupont", 20));

		Comparator<Personne1> comparateur = Comparator.comparing(Personne1::getNom).thenComparing(Personne1::getPrenom)
				.thenComparing(Personne1::getAge);

		System.out.println("Liste triée:");
		personnes.stream().sorted(comparateur).forEach(System.out::println);

		Comparator<Personne1> comparateurVariante = Comparator.comparing(Personne1::getNom)
				.thenComparing(Personne1::getAge, Comparator.reverseOrder());

		System.out.println("\nListe triée (variante):");
		personnes.stream().sorted(comparateurVariante).forEach(System.out::println);
	}
}
