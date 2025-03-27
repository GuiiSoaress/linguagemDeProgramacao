package aula_04;

import java.util.Scanner;

//10.Faça um programa que verifique se um número é múltiplo de 2 ou 3.
public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("               Verifique se o numero é múltiplo de 2 ou 3                 ");
		System.out.println("--------------------------------------------------------------------------");

		System.out.println("Digite um número");
		double num = scan.nextDouble();
		
		if ((num % 2) == 0 ) {
			System.out.printf("O número %.2f é multiplo de 2", num);
		}else if ((num % 3 ) == 0) {
			System.out.printf("O número %.2f é multiplo de 3", num);		
		}else {
			System.out.printf("O número %.2f não é multiplo de 2 nem 3", num);
		}

		scan.close();
	}

}
