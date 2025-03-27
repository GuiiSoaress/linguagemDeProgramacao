package aula_04;

import java.util.Scanner;

//14.Você deve fazer um programa que leia um valor qualquer e apresente
//uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50],
//(50,75], (75,100]) este valor se encontra. Obviamente se o valor não
//estiver em nenhum destes intervalos, deverá ser impressa a mensagem
//“Fora de intervalo”.

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		double num = scan.nextDouble();
		
		if (num >= 0 && num <= 25) {
			System.out.printf("O número %.2f está no intervalo de 0 a 25", num);
		}else if (num >= 25.01 && num <= 50) {
			System.out.printf("O número %.2f está no intervalo de 25 a 50", num);
		}else if (num >= 50.01 && num <= 75) {
			System.out.printf("O número %.2f está no intervalo de 50 a 75", num);
		}else if (num >= 75.01 && num <= 100) {
			System.out.printf("O número %.2f está no intervalo de 75 a 100 ", num);
		}else {
			System.out.println("Fora de Intevalo!!");
		}
		
		scan.close();
	}

}
