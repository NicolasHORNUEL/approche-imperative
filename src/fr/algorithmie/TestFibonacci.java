package fr.algorithmie;

import java.util.Scanner;

public class TestFibonacci {

	public static void main(String[] args) {
		// Open the scanner
		Scanner scanner = new Scanner(System.in);
		
		// Ask user to choose a number
		System.out.println( "Choisir un rang N :" );
		int N = scanner.nextInt();
		
		// Process with static method
		int FiboN = InteractifFibonacci.getFibo(N);
		
		// Show result
		System.out.println( "Voici la somme Fibonacci pour le rang "+N+" : "+FiboN);
		
		// close the scanner
	    scanner.close();

	}

}
