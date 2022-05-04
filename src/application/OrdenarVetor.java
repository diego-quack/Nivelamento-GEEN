package application;

import java.security.SecureRandom;
import java.util.Arrays;

public class OrdenarVetor {

	public static void main(String[] args) {
		
		SecureRandom numeros = new SecureRandom();
		int[] vetor = new int[10];
		int i;
		
		for (i = 0; i < vetor.length; i++) {
			vetor[i] = 10 + numeros.nextInt(90);
		}
		System.out.println(Arrays.toString(vetor));
		ordenar(0, vetor.length - 1, vetor);
		System.out.println(Arrays.toString(vetor));
	}

	public static void ordenar(int inicio, int fim, int[] vetor) {

		int temp;

		if (inicio < fim) {
			temp = dividirVetor(inicio, fim, vetor);
			ordenar(inicio, temp - 1, vetor);
			ordenar(temp + 1, fim, vetor);
		}
	}

	public static int dividirVetor(int inicio, int fim, int[] vetor) {

		int j = fim;
		int auxiliar;
		int pivo = vetor[inicio];

		for (int i = fim; i >= inicio; i--) {
			if (vetor[i] >= pivo) {
				auxiliar = vetor[j];
				vetor[j] = vetor[i];
				vetor[i] = auxiliar;
				j--;
			}
		}
		return j + 1;
	}
}
