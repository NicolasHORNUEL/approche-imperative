package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		System.out.println("\nAffichage du tableau array :\n");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");	
		}
		System.out.println("\n_________________________________________\n");
	
		
		System.out.println("dans l'ordre inverse :\n");
		for (int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i]+" ");	
		}
		System.out.println("\n_________________________________________\n");


		System.out.println("Affichage du tableau arrayCopy :\n");
		int[] arrayCopy = array;
		for (int i = 0; i < arrayCopy.length; i++) {
			System.out.print(arrayCopy[i]+" ");	
		}
		System.out.println("\n_________________________________________");


		
	}

}
