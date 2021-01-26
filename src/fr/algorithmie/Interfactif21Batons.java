package fr.algorithmie;

import java.util.Scanner;

public class Interfactif21Batons {

	public static void main(String[] args) {
		
		// Open the scanner
		Scanner scanner = new Scanner(System.in);
		
		// Ask user to start
		System.out.println( "Souhaitez-vous commencer : (Y/N)" );
		char choice = scanner.next().charAt(0);
		while (choice!='Y' && choice!='N') {
			System.out.println( "Je n'ai pas compris, souhaitez-vous commencer : (Y/N)" );
			choice = scanner.next().charAt(0);
		}
		
		// Progression one-at-a-time
		if (choice=='Y') {
			takeTurns("Le joueur", "L'ordinateur");
		} else if (choice=='N') {
			takeTurns("L'ordinateur", "Le joueur");
		}
		
		// close the scanner
	    scanner.close();
	    System.out.println("Scanner Closed.");

	}
	
	static void takeTurns(String joueur1, String joueur2) {
		System.out.println( joueur1 + " commence...");
		for (int i = 1; i <= 21; i++) {
			if (i%2!=0) {
				System.out.print( "Tour n°" + i + " : " + joueur1 + " prend 1 baton. ");
			} else {
				System.out.print( "Tour n°" + i + " : " + joueur2 + " prend 1 baton. ");
			}
			if (i==21) {
				System.out.println( joueur1 + " perd!" );
				System.out.println( joueur2 + " gagne!" );
			} else if (i==20) {
				System.out.println( "Il ne reste qu'un seul baton..." );
			} else {
				System.out.println( "Il reste " + (21-i) + " batons." );
			}
		}	
	}

}
