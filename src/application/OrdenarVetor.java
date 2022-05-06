package application;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrdenarVetor {

	public static void main(String[] args) {

		SecureRandom numeros = new SecureRandom();
		int[] vetor = new int[10];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = 10 + numeros.nextInt(90);
		}
		System.out.println("Vetor gerado: " + Arrays.toString(vetor));
		ordenar(0, vetor.length - 1, vetor);
		System.out.println("Vetor ordenado: " + Arrays.toString(vetor));

		primo(vetor);

	}

	public static void primo(int[] vetor) {

		List<Integer> listaDePrimos = new ArrayList<Integer>();
		List<Integer> listaDeIndices = new ArrayList<Integer>();
		List<Integer> lista = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			lista.add(vetor[i]);
		}

		int divisor = 0;

		for (Integer numeroPrimo : lista) {
			for (int j = 1; j <= numeroPrimo; j++) {
				if (numeroPrimo % j == 0) {
					divisor++;
				}
			}

			if (divisor == 2) {
				listaDePrimos.add(numeroPrimo);
			}
			divisor = 0;
		}
		for (Integer indice : lista) {
			listaDeIndices.add(listaDePrimos.indexOf(indice));
		}
		System.out.println("Números primos da lista: " + listaDePrimos);
		System.out.println("Índices: " + listaDeIndices);
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
