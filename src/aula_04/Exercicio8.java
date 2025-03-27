package aula_04;

import java.util.Scanner;

//8. Escreva um programa que classifique um triângulo em equilátero, isósceles ou escaleno.

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                    Classificação de Triângulos                          ");
		System.out.println("--------------------------------------------------------------------------");
		
		System.out.println("Digite o primeiro lado do triangulo");
		double l1 = scan.nextDouble();
		
		System.out.println("Digite o segundo lado do triangulo");
		double l2 = scan.nextDouble();
		
		System.out.println("Digite o terceiro lado do triangulo");
		double l3 = scan.nextDouble();
		
		
		if (l1 == l2 && l2 == l3) {
			//Equilatero
			System.out.println("O triângulo é classificado como equilatero");
		}else if (l1 == l2 || l2 == l3 || l1 == l3) {
			//isóceles
			System.out.println("O triângulo é classificado como isóceles");
		}else if (l1 != l2 && l2 != l3 ) {
				//Escaleno
				System.out.println("O triângulo é classificado como Escaleno");
			}
		
		scan.close();
	}

}
