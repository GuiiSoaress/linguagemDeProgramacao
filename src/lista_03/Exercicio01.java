package lista_03;


//1) Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo
//tipo e tamanho e com os "mesmos" elementos do vetor A.

public class Exercicio01 {

	public static void main(String[] args) {
		int[] vetorA = {5, 21, 7, 30, 40, 25, 18, 77, 51, 17};
		int[] vetorB = new int[10];
		
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
