package aula_07;

import java.util.Scanner;

public class DesafioArrayUnidimensional {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
			
		System.out.print("Digite o numero de pessoas: ");
		int nPessoas = scan.nextInt();
		
		double[] alturas = new double[nPessoas];
		double media = 0;

		
		for (int i = 0; i < nPessoas; i++) {
			System.out.print("Altura da "+ (i+1) +"° pessoa: ");
			alturas[i] = scan.nextDouble();
		}
		
		for(int j = 0; j < nPessoas; j++) {
			media += alturas[j];
		}
		
		media /= nPessoas;
		
		System.out.printf("A media das alturas é: %.2f", media);
		scan.close();
	}

}
