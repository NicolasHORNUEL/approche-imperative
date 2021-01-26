package fr.algorithmie;

import java.util.Scanner;
import java.util.Arrays;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		Scanner scanner = new Scanner(System.in);	
		System.out.println( "1. Ajouter un nombre" );
		System.out.println( "2. Afficher les nombres existants." );
		System.out.println( "Choisir l'option 1 ou 2 :" );
		int option = scanner.nextInt();	
		if (option==1) {
			System.out.println( "Veuillez saisir un nombre au hasard :" );
			int nb = scanner.nextInt();	
			int count = array.length;
			int[] newArray = new int[count+1];
			for (int i = 0; i < count; i++) {
				newArray[i] = array[i];
			}
			newArray[count] = nb;
			//System.out.println(Arrays.toString(newArray));
		} else if (option==2){
			System.out.println(Arrays.toString(array));
			
		}

		// close the scanner
	    scanner.close();

	}

}
