

package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		
		// Open the scanner
		Scanner scanner = new Scanner(System.in);	
		
		// Ask user
		System.out.println( "Veuillez saisir un nombre : " );
		
		// collect response
		int nb = scanner.nextInt();	
		
		// Process addition
		int somme = 0;
		for (int i = 1; i <= nb; i++) {
			somme += i;
		}
		
		// Show result
		System.out.println("La somme de tous les entiers compris entre 1 et "+nb+" est "+somme);
		
		// close the scanner
	    scanner.close();

	}

}
