package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int somme1 = 0;
		for (int i = 0; i < array1.length; i++) {
			somme1 += array1[i];
		}
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 } ;
		int somme2 = 0;
		for (int j = 0; j < array2.length; j++) {
			somme2 += array2[j];
		}
		int[] arrays = {somme1, somme2};
		System.out.println(somme1 + " " + somme2);
		System.out.println(arrays[0] + " " + arrays[1]);

	}

}
