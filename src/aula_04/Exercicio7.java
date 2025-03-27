package aula_04;

import java.util.Scanner;

//Crie um programa que verifique se um caractere é uma vogal ou uma
//consoante. Utilize o comando next().charAt(0) para ler um caractere.

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um caracter (digite em minusculo");
		char letra = scan.next().charAt(0);
		
		if 	( letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("A letra "+ letra + " é uma vogal");
		}else {
			System.out.println("A letra "+ letra + " é uma consoante");
		}
			
		scan.close();

	}

}
