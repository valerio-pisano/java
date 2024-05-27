package com.example.arraypersone;
import java.util.Scanner;

public class GestionePersone {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numeroPersone = leggiNumeroPersone(scanner);
		Persona[] persone = new Persona[numeroPersone];

		caricaPersone(persone, scanner);
		stampaPersone(persone);

		scanner.close();
	}

	private static int leggiNumeroPersone(Scanner scanner) {
		System.out.print("Inserisci il numero di persone: ");
		return scanner.nextInt();
	}

	private static void caricaPersone(Persona[] persone, Scanner scanner) {
		scanner.nextLine();  // Consuma la newline lasciata da nextInt()

		for (int i = 0; i < persone.length; i++) {
			System.out.println("Inserisci i dati della persona " + (i + 1) + ":");
			System.out.print("Nome: ");
			String nome = scanner.nextLine();
			System.out.print("Cognome: ");
			String cognome = scanner.nextLine();
			System.out.print("Età: ");
			int eta = scanner.nextInt();
			scanner.nextLine();  // Consuma la newline lasciata da nextInt()

			persone[i] = new Persona(nome, cognome, eta);
		}
	}

	private static void stampaPersone(Persona[] persone) {
		System.out.println("\nDati delle persone inserite:");
		for (Persona persona : persone) {
			System.out.println(persona);
		}
	}
}
