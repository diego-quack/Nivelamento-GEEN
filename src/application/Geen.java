package application;

public class Geen {

	public static void main(String[] args) {
		
		fibonacci(10);

	}
	
	public static int fibonacci(int n) {
		
		int ultimo = 1;
		int penultimo = 0;
		int i = 3;
		int seguinte;
		
		while(n > i) {
			seguinte = ultimo + penultimo;
			penultimo = ultimo;
			i++;
		}
		return n;
	}
}
