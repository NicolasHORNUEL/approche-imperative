/**
 * 
 */
package fr.declaration.variable;

/**
 * @author nicolas
 *
 */
public class DeclarationApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		int i = 4;
		long l = 13_000_000L;
		float f = 1.5F;
		double d = 1.555555;
		char car = '\u1589';
		boolean bool = false;
		String chaine = "voici ma chaîne de caractères";
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(car);
		System.out.println(bool);
		System.out.println(chaine);
		String randomString = "Voici le résultat d’un calcul : \n1+5=6";
		System.out.println(randomString);
		int a = 053;
		System.out.println(a);
		String[] chaines = new String[3];
		chaines[0] = "Bonjour";
		chaines[1] = " à toutes";
		chaines[2] = " et à tous";
		System.out.println(chaines);
	}

}
