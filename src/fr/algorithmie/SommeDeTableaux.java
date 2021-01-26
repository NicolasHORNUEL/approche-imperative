package fr.algorithmie;

public class SommeDeTableaux {

	public static void main(String[] args) {

		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;

		int somme1 = 0;
		int somme2 = 0;
		
		for (int i = 0; i < array1.length; i++) {
			somme1 += array1[i];
			somme2 += array2[i];
		}

		int[] arrays = {somme1, somme2};
		
		System.out.print("La somme des " + array1.length + " éléments ");
		System.out.println("du tableau 1 est : " + arrays[0]);
		
		System.out.print("La somme des " + array2.length + " éléments ");
		System.out.println("du tableau 2 est : " + arrays[1]);

	}

}
