package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		
		// Java choisi un nombre aléatoire entre 1 et 100
		Random r = new Random();
		int nbRandom = r.nextInt((100 - 1) + 1) + 1;
		
		// Demander à l'utilisateur de trouver ce nombre
		Scanner scanner = new Scanner(System.in);	
		System.out.println( "Veuillez deviner le nombre (entre 1 et 100) : " );
		int nb = scanner.nextInt();
		
		// Afficher un indice, énumérer les essais
		int Ncoups = 1;
		while (nb != nbRandom) {
			if (nb < nbRandom) {
				System.out.println( "Vous êtes en-dessous du nombre. Réessayez : " );
				nb = scanner.nextInt();
			} else if (nb > nbRandom) {
				System.out.println( "Vous êtes au-dessus du nombre. Réessayez : " );
				nb = scanner.nextInt();
			}
			Ncoups++;
		}
		
		System.out.println("Bravo, vous avez trouvé en "+Ncoups+" coups.");
		// close the scanner
	    scanner.close();

	}

}
