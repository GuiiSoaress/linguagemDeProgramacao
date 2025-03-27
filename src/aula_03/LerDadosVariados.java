package aula_03;

import java.util.Scanner;

public class LerDadosVariados {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o seu primeiro nome: ");
		String primeiroNome = scan.next();
		
		System.out.println("Digite sua idade em anos: ");
		int idade = scan.nextInt();

		System.out.println("Digite sua algura em metros: ");
		double altura = scan.nextDouble();
		
		System.out.println("Olá, " + primeiroNome + " você tem " + idade + " anos e mede " + altura + " metros.");
		
		scan.close();
	}

}
