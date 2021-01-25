package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int arraySum = 0;
		for (int i = 0; i < array.length; i++) {
			arraySum += array[i];
		}
		float arrayAverage = (float) arraySum / array.length;
		System.out.println(arraySum + " / " +  array.length + " = " + arrayAverage);
	}

}
