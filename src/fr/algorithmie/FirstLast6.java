package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		int[] array = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 6} ; //true
		boolean control = false;
		if ( (array.length>=1 && array[0]==6) || (array.length>=1 && array[array.length-1]==6) ) {
			control = !control;
		}		
		System.out.println(control);	
	}

}
