package aula_03;

import java.util.Scanner;

public class LerDadosTeclado {

	public static void main(String[] args) {
		
		//cria um objeto de leitura de dados do teclado
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		
		String nome = scan.nextLine();
		
		System.out.println("Olá, " + nome + " seja bem-vindo(a)");
		
		
		
		scan.close();

	}

}
