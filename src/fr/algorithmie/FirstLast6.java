package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ; //false
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 6} ; //true
		int[] array3 = {} ; //false
		int[] array4 = {6, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4} ; //true

		
		
		boolean control = false;
		
		int[] array = array4;
		if ( (array.length>=1 && array[0]==6) || (array.length>=1 && array[array.length-1]==6) ) {
			control = !control;
		}
		System.out.println(control);
	}

}
