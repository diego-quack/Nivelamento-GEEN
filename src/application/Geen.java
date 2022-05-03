package application;

public class Geen {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.print(fibonacci(i) + ", ");
		}

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
}
