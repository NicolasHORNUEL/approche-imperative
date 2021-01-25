package fr.algorithmie;
import java.util.Arrays;

public class Rotation {

	public static void main(String[] args) {
		int[] array = {0,1,2,3};
		int firstLast = array[array.length-1];
		for (int i = array.length; i >= 2; i--) {
			array[i-1] = array[i-2];			
		}
		array[0]=firstLast;
		System.out.println(Arrays.toString(array));
	}

}
