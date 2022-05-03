package application;

public class Geen {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.print(fibonacciRecursiva(i) + ", ");
		}
		System.out.println(fibonacciRecursiva(10));

	}

	public static int fibonacci(int n) {

		int ultimo = 1;
		int penultimo = 0;
		int i = 3;
		int seguinte;

		if (n == 1) {
			return 0;
		}
		if (n == 2) {
			return 1;
		}

		while (n >= i) {
			seguinte = ultimo + penultimo;
			penultimo = ultimo;
			ultimo = seguinte;
			i++;
		}
		return ultimo;
	}
	
	public static int fibonacciRecursiva(int n) {
		
		int num = 0;
		if(n == 0) {
			return 0;
		}
		else if(n == 2) {
			return 1;
		}
		else if(n >= 3) {
			num = fibonacciRecursiva(n - 1) + fibonacciRecursiva(n - 2);
		}
		return n;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
