package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		System.out.println("\nEntiers supérieur à 3 : \n");
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 3) {
				System.out.print(array[i]+" ");
			}
		}
		System.out.println("\n\n-----------------------------------------");
		System.out.println("\nEntiers pairs : \n");
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0 &&  array[i]%2==0) {
				System.out.print(array[i]+" ");
			}
		}
		System.out.println("\n\n-----------------------------------------");
		System.out.println("\nValeurs des Index pairs : \n");
		for (int i = 0; i < array.length; i++) {
			if (i%2==0) {
				System.out.print(array[i]+" ");
			}
		}
		System.out.println("\n\n-----------------------------------------");
		System.out.println("\nEntiers impairs : \n");
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0 &&  array[i]%2!=0) {
				System.out.print(array[i]+" ");
			}
		}
	}

}
