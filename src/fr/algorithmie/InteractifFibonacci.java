package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {
		
		// Open the scanner
		Scanner scanner = new Scanner(System.in);
		
		// Ask user to choose a number
		System.out.println( "Choisir un rang N :" );
		int N = scanner.nextInt();	
		
		// Fibonacci progression
		int Fibo0 = 0;
		int Fibo1 = 1;
		int FiboN = 0;		
		for (int i = 0; i < N; i++) {
			Fibo0 = Fibo1;
			Fibo1 = FiboN;
			FiboN = Fibo0 + Fibo1;
		}
		
		// Show result
		System.out.println( "Voici la somme Fibonacci pour le rang "+N+" : "+FiboN);
		
		// close the scanner
	    scanner.close();
	}

}
