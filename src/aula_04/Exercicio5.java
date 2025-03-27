package aula_04;

import java.util.Scanner;

//5. Faça um programa que classifique a nota de um estudante em A, B, C, D
//ou E, com base em sua pontuação. A nota deverá variar de 0 a 100 e a
//classificação em intervalos de 20 pontos.

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                        Calculadora de Notas                              ");
		System.out.println("--------------------------------------------------------------------------");
		
		System.out.print("Digite sua pontuação");
		double nota = scan.nextDouble();
		
		if ( nota >= 0 && nota <= 20 ) {
			System.out.println("Sua menção é E");
		}else if ( nota > 20 && nota <= 40 ) {
			System.out.println("Sua menção é D");
		}else if ( nota > 40 && nota <= 60 ) {
			System.out.println("Sua menção é C");
		}else if ( nota > 60 && nota <= 80 ) {
			System.out.println("Sua menção é B");
		}else {
			System.out.println("Sua menção é A");
		}
		
		scan.close();
	}

}
