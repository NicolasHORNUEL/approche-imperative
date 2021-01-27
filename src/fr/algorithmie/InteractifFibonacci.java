package fr.algorithmie;

public class InteractifFibonacci {
		
	static int getFibo(int N) {
		
		// Fibonacci progression
		int Fibo0 = 0;
		int Fibo1 = 1;
		int FiboN = 0;		
		for (int i = 0; i < N; i++) {
			Fibo0 = Fibo1;
			Fibo1 = FiboN;
			FiboN = Fibo0 + Fibo1;
		}
		
		return FiboN;
	}

}
