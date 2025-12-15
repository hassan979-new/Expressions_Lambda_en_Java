package com.exemple.tp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@FunctionalInterface
interface IOFunction<T, R> {
	R apply(T t) throws IOException;

	static <T, R> Function<T, R> uncheked(IOFunction<T, R> f) {
		return t -> {
			try {
				return f.apply(t);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		};
	}
}

public class ExceptionsLambda {
	public static void main(String[] args) {
		try {
			List<String> fichier = Files.list(Paths.get(".")).map(p -> {
				try {
					return Files.size(p) + " - " + p.getFileName();
				} catch (IOException e) {
					return "Erreur: " + p.getFileName();
				}
			}).collect(Collectors.toList());

			System.out.println("Fichiers: " + fichier);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			List<Long> tailles = Files.list(Paths.get(".")).map(IOFunction.uncheked(Files::size))
					.collect(Collectors.toList());
			System.out.println("Tailles: " + tailles);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

}
