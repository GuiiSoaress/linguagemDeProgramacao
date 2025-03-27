package aula_04;

import java.util.Scanner;

///13.Com base na tabela a seguir, escreva um programa que leia o código de
//um item e a quantidade deste item. Calcule e mostre o valor da conta a
//pagar.
public class Exercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                            Hoto dog do zé                                ");
		System.out.println("--------------------------------------------------------------------------");

		System.out.println("Selecione um item pelo codigo e digite a quantidade consumida");
		System.out.println("Codigo-----------Especificação-----------Preço--------");
		System.out.println("   1       |    Cachorro Quente     |     R$4,00      ");
		System.out.println("   2       |     X-Salada           |     R$4,50      ");
		System.out.println("   3       |     X-Bacon            |     R$5,00      ");
		System.out.println("   4       |    Torrada Simples     |     R$2,00      ");
		System.out.println("   5       |     Refrigerante       |     R$1,50      ");
		System.out.println("------------------------------------------------------");
		
		double p1 = 4.00;
		double p2 = 4.50;
		double p3 = 5.00;
		double p4 = 2.00;
		double p5 = 1.50;
		
		String e1 = "Cachorro Quente";
		String e2 = "X-Salada";
		String e3 = "X-Bacon";
		String e4 = "Torrada Simples";
		String e5 = "Refrigerante";
		
		
		System.out.println("Digite o codigo do item consumido.");
		int cod = scan.nextInt();
		
		System.out.println("Digite a quantidade consumida.");
		int quant = scan.nextInt();
		
		
		if (cod == 1) {
			p1 = p1 * quant;
			System.out.println("Você consumiu "+ quant +" "+ e1 + "s. Sua conta deu R$"+ p1 + " Reais." );
		}else if (cod == 2) {
			p2 = p2 * quant;
			System.out.println("Você consumiu "+ quant +" "+ e2 + ". Sua conta deu R$"+ p2 + " Reais." );
		}else if (cod == 3) {
			p3 = p3 * quant;
			System.out.println("Você consumiu "+ quant +" "+ e3 + ". Sua conta deu R$"+ p3 + " Reais." );
		}else if (cod == 4) {
			p4 = p4 * quant;
			System.out.println("Você consumiu "+ quant +" "+ e4 + ". Sua conta deu R$"+ p4 + " Reais." );
		}else if (cod == 5) {
			p5 = p5 * quant;
			System.out.println("Você consumiu "+ quant +" "+ e5 + "s. Sua conta deu R$"+ p5 + " Reais." );
		}else {
			System.out.println("Codigo inválido");
		}
		
		scan.close();
	}       

}
