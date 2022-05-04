package application;

public class OrdenarVetor {

	public static void main(String[] args) {
		
		
	}
	
	public static void ordenar(int inicio, int fim, int[] vetor) {
		
		int temp;
		
		if(inicio < fim) {
			temp = dividirVetor(inicio, fim, vetor);
			ordenar(inicio, temp - 1, vetor);
			ordenar(temp + 1, fim, vetor);
		}
		
	}
	
	public static int dividirVetor(int inicio, int fim, int[] vetor) {
		
		int j = fim;
		int auxiliar;
		int pivo = 0;
		
		for(int i = fim; i >= inicio; i--) {
			if(vetor[i] > pivo) {
				auxiliar = vetor[j];
				vetor[j] = vetor[i];
				vetor[i] = auxiliar;
				j--;
			}
		}
		return j + 1;
	}
}
