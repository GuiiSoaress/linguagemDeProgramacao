package aula_04;

import java.util.Scanner;

//2. Crie um programa que determine se um número é par ou ímpar.

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int num = scan.nextInt();
		
		int res = num % 2;
		if (res == 0 ) {
			System.out.println("O número "+ num + " é par");
		}else {
			System.out.println("O número "+ num + " é impar");
		}
		scan.close();
	}

}
