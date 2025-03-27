package aula_04;

import java.util.Scanner;

//11.Crie um programa que verifique se um número é divisível por 4 e 7 ao
//mesmo tempo.
public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("         Verifique se o numero é múltiplo de 4 e 7 ao mesmo tempo         ");
		System.out.println("--------------------------------------------------------------------------");
		
		System.out.println("Digite um número");
		double num = scan.nextDouble();
		
		if ((num % 4) == 0 && (num % 7) == 0) {
			System.out.printf("O número %.2f é divisível por 4 e 7 ao mesmo tempo", num);
		}else {
			System.out.printf("O número %.2f NÃO é divisível por 4 e 7 ao mesmo tempo", num);
		
		}
		
		scan.close();
	}

}
