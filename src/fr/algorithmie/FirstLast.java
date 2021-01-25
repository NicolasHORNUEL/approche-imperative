package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		int[] array = {1, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 1} ; //true	
		boolean control = false;
		if ( (array.length>=1 && array[0]==array[array.length-1]) ) {
			control = !control;
		}
		System.out.println(control);
	}

}
