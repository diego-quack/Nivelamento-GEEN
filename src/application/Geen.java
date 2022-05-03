package application;

public class Geen {

	public static void main(String[] args) {
		
		System.out.println(fibonacci(20));

	}
	
	public static int fibonacci(int n) {
		
		int ultimo = 1;
		int penultimo = 0;
		int i = 3;
		int seguinte;
		
		if(n == 1) {
			return 0;
		}
		if(n == 2) {
			return 1;
		}
		
		while(n > i) {
			seguinte = ultimo + penultimo;
			penultimo = ultimo;
			i++;
		}
		return n;
	}
}
