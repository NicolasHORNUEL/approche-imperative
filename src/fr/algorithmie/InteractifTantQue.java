package fr.algorithmie;
import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		
		// Open the scanner
		Scanner scanner = new Scanner(System.in);
	
		// Ask user
		System.out.println( "Veuillez saisir un nombre compris entre 1 et 10 : " );
		
		// collect response
		int nb = scanner.nextInt();	
		
		// check number and ask again if necessary
		while (nb<1 || nb>10) {
			System.out.println( "Veuillez saisir un nombre compris entre 1 et 10 : " );
			nb = scanner.nextInt();
		}
		
		// show number, good response
		System.out.println(nb);
		
		// close the scanner
	    scanner.close();
	}
}
