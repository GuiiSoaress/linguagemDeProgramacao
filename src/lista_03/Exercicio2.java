package lista_03;

//2) Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo
//tipo e tamanho e com os elementos do vetor A multiplicados por 2.

public class Exercicio2 {

	public static void main(String[] args) {
		int[] vetorA = {5, 21, 7, 30, 40, 25, 18, 77};
		int[] vetorB = new int[8];
		
		System.out.print("Vetor A: ");
		for(int i = 0; i <=9; i++) {
			System.out.print("|" + vetorA[i]);
		}
		
		System.out.println();
		vetorB = vetorA.clone();
		
		System.out.print("Vetor b: ");
		for(int i = 0; i <=9; i++) {
			System.out.print("|" + vetorB[i]);
		}
	}

}
