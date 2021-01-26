package fr.algorithmie;
import java.util.Arrays;

public class Rotation {

	public static void main(String[] args) {
		
		// affichage du tableau initial
		int[] array = {0,1,2,3};
		System.out.println(Arrays.toString(array));

		// on stock le dernier élément du tableau
		int firstLast = array[array.length-1];
		
		// on déplace les autres éléments un à un vers la droite
		for (int i = array.length; i >= 2; i--) {
			array[i-1] = array[i-2];			
		}
		
		// on affecte le premier élément du tableau avec l'ancien dernier élément
		array[0]=firstLast;
		
		// on affiche le tableau modifié
		System.out.println(Arrays.toString(array));
	}

}
