package aula_04;

import java.util.Scanner;

//12.Leia 2 valores inteiros (A e B). Após, o programa deverá mostrar uma
//mensagem "São Múltiplos" ou "Não são Múltiplos", indicando se os
//valores lidos são múltiplos entre si. Atenção: os números podem ser
//digitados em ordem crescente ou decrescente.

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                  Verifique se os números são multíplos                   ");
		System.out.println("--------------------------------------------------------------------------");
		
		System.out.println("Digite um número");
		int n1 = scan.nextInt();
		
		System.out.println("Digite outro número");
		int n2 = scan.nextInt();
		
		if ((n1 % n2) == 0 && (n2 % n2) == 0) {
			System.out.printf("Os números " + n1 +" e "+ n2 + " são multíplos");
		}else {
			System.out.printf("Os números " + n1 +" e "+ n2 + " não são multíplos");
		}
		
		scan.close();
	}

}
