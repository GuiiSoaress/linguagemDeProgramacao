package aula_04;

import java.util.Scanner;

//3. Escreva um programa que informe se um número é divisível por 3 e 5 ao mesmo tempo.


public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		double num = scan.nextDouble();
		
		double res3 = num % 3;
		double res5 = num % 5;
		
		
		if ( res3 == 0 && res5 == 0 ) {
			System.out.printf("O número %.2f é divisível por 3 e 5 ao mesmo tempo", num);
		}else if ( res3 == 0) {
			System.out.printf("O número %.2f só é divisível por 3", num);
		}
		else if ( res5 == 0) {
			System.out.printf("O número %.2f só é divisível por 5", num);
		}else
		{
			System.out.printf("O número %.2f não é divisivel por 5 e 3 ao mesmo tempo", num );
		}
 
		scan.close();
	}

}
