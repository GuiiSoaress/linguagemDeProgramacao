package aula_03;

import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um dia da semana de 1 a 7");
		int dia = scan.nextInt();
		
		if (dia > 7 ) {
			System.out.println("Valor Inválido !!! Digite um valor de 1 a 7!");
		}else if (dia == 1) {
			System.out.println("Hoje é Domingo");
		}
		else if (dia == 2) {
			System.out.println("Hoje é Segunda-Feira");
		}else if (dia == 3) {
			System.out.println("Hoje é Terça-Feira");
		}else if (dia == 4) {
			System.out.println("Hoje é Quarta-Feira");
		}else if (dia == 5) {
			System.out.println("Hoje é Quinta-Feira");
		}else if (dia == 6) {
			System.out.println("Hoje é Sexta-Feira");
		}else if (dia == 7) {
			System.out.println("Hoje é Sábado");
		}
		
		scan.close();
	}

}
