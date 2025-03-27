package aula_04;

import java.util.Scanner;

//9. Faça um programa que verifique se uma pessoa pode votar ou não com
//base na idade (maior de 16 anos).

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Você pode Votar?");
		System.out.print("Digite Sua Idade:  ");
		int idade = scan.nextInt();
		
		if (idade >= 16) {
			
			System.out.println("Você tem " + idade + " anos e ja pode Votar!!");
		}else {
			System.out.println("Você tem " + idade + " anos e não  pode Votar!");			
		}
		
		
		scan.close();

	}

}
