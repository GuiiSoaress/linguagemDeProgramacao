package aula_04;

import java.util.Scanner;

//16.Leia um valor com duas casas decimais, equivalente ao salário de uma
//pessoa, em seguida, calcule e mostre o valor que esta pessoa deve
//pagar de Imposto de Renda, segundo a tabela abaixo.

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                    Calculadora de imposto de renda                       ");
		System.out.println("--------------------------------------------------------------------------");
		
		System.out.println("Digite o seu Salário");
		double sal = scan.nextDouble();
		
		if (sal <= 2000.00) {
			System.out.printf("Seu salário é %.2f e você é isento de imposto renda", sal);
		}else if (sal >= 2000.01 && sal <= 3000.00) {
			double imp = sal * 0.08;
			System.out.printf("Seu salário é R$%.2f e você devera pagar 8%% de imposto de renda, que é igual a R$%.2f", sal, imp);
		}else if (sal >= 3000.01 && sal <= 4500.00) {
			double imp = sal * 0.18;
			System.out.printf("Seu salário é R$%.2f e você devera pagar 18%% de imposto de renda, que é igual a R$%.2f", sal, imp);
		}else {
			double imp = sal * 0.28;
			System.out.printf("Seu salário é R$%.2f e você devera pagar 28%% de imposto de renda, que é igual a R$%.2f", sal, imp);
		}
		
		scan.close();
	}

}
