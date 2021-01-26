package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		
		// open the scanner
		Scanner scanner = new Scanner(System.in);	

		// Ask 10 times any number, compare with biggest and reassign
		int nbBiggest = 0;
		int nb;
		for (int i = 1; i <= 10; i++) {
			System.out.println( "Veuillez saisir un nombre : " );
			nb = scanner.nextInt();	
			if (nb >= nbBiggest) {
				nbBiggest = nb;
			}
		}
		System.out.println(nbBiggest+" est le plus grand de ces nombres.");
		
		// close the scanner
	    scanner.close();

	}

}
