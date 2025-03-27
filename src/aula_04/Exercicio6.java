package aula_04;

import java.util.Scanner;

//6. Faça um programa que determine o maior de três números.

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		double n1 = scan.nextDouble();
		
		System.out.println("Digite outro número");
		double n2 = scan.nextDouble();
		
		System.out.println("Digite mais um número");
		double n3 = scan.nextDouble();
		
		double m1;
		
		if( n1 > n2 && n1 > n3) {
			m1 = n1;
		}else if ( n2 > n1 && n2 > n3) {
			m1 = n2;
		}else {
			m1 = n3;
		}
		
		System.out.printf("O numero %.2f é o maior entre: %.2f e %.2f e %.2f   ",m1, n1, n2, n3);
		
		scan.close();
	}
	
	

}
