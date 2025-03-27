package aula_04;

import java.util.Scanner;

public class ExemploPrintf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número ");
		double n1 = scan.nextDouble();
		
		System.out.print("Digite outro número ");
		double n2 = scan.nextDouble();
		double resultado = n1/n2;
		
		System.out.printf("%.2f / %.2f = %.2f" ,n1, n2, resultado);
		scan.close();
	}

}
