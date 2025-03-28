package aula_10;

import java.util.Scanner;

public class MetodoComParametro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Digite seu nome: ");
		nome = scan.nextLine();
		saudacao(nome);

	}
	
	public static void saudacao(String name) {
		System.out.println("Olá "+ name + ", Vamos tomar um café");
	}

}
