package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		// open the scanner
		Scanner scanner = new Scanner(System.in);	
		System.out.println( "Veuillez saisir un nombre : " );
		int nb = scanner.nextInt();	
		for (int i = 1; i <= 10; i++) {
			if (i==10) {
				System.out.print(nb+i+".");
			} else {
				System.out.print(nb+i+", ");
			}
		}
		// close the scanner
	    scanner.close();
	}

}
