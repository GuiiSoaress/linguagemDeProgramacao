package aula_04;

import java.util.Scanner;

//1. Faça um programa que verifique se um número é positivo, negativo ou zero.

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número ");
		double num = scan.nextDouble();
		
		if (num > 0) {
			System.out.printf("O número %.2f é positivo", num);
		}else if (num < 0 ) {
			System.out.printf("O número %.2f é negativo", num);
		}else {
			System.out.println("O número é zero");
		}
			
		scan.close();
		
		
		
		
	}

}
