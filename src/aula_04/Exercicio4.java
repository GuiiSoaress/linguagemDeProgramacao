package aula_04;

import java.util.Scanner;

//4. Crie um programa que determine se um ano é bissexto ou não. 

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um Ano");
		int ano = scan.nextInt();
		
		
		//etapa 1 
		if ((ano % 4) == 0) {
			
			//etapa 2 
			if ((ano % 100) == 0 ) {
				
				//etapa 3 
				if ((ano % 400) == 0 ) {
					
					//etapa 4
					System.out.println("O ano " + ano + " é um ano bissexto");
				}else {
					
					//etapa 5 
					System.out.println("O ano "+ ano + " não é um ano bissexto (tem 365 dias)");
				}
			}else {
				//etapa 4 
				System.out.println("O ano " + ano + " é um ano bissexto");
			}
			
		}else
		{
			//etapa 5 
			System.out.println("O ano "+ ano + " não é um ano bissexto (tem 365 dias)");
		}
				
		scan.close();
	}

}
