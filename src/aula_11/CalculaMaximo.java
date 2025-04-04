package aula_11;

import java.util.Scanner;

public class CalculaMaximo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.print("Digite o primeiro numero: ");
			int n1 = scan.nextInt();
			
			System.out.print("Digite o segundo numero: ");
			int n2 = scan.nextInt();
			
			System.out.print("Digite o terceiro numero: ");
			int n3 = scan.nextInt();
			
			System.out.println("O maior numero entre os digitados é: " + calculaMaximo(n1, n2, n3));
//			System.out.println("O maior numero entre os digitados é: " + Math.max(n1, Math.max(n2, n3)));
		}
		catch(Exception erro) {
			System.out.println("Erro: " + erro);
		}
		finally {
			scan.close();
		}
	}
	
	public static int calculaMaximo(int n1, int n2, int n3) {
		
		int maiornum = 0;
		
		if (n1 > n2 && n1> n3) {
			maiornum = n1;
		}else if (n2 > n1 && n2 > n3){
			maiornum = n2;
		}else {
			maiornum = n3;
		}
		
		return maiornum;
	}
}
