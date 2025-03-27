package aula_04;

import java.util.Scanner;

//15.Leia 2 valores com uma casa decimal (x e y), que devem representar as
//coordenadas de um ponto em um plano. A seguir, determine qual o
//quadrante ao qual pertence o ponto, ou se está sobre um dos eixos
//cartesianos ou na origem (x = y = 0).
 
//Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o ponto
//estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
//situação.

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                    Coordenadas do plano Cartesiano                       ");
		System.out.println("--------------------------------------------------------------------------");
		
		System.out.println("Digite uma valor para X");
		double x = scan.nextDouble();
		
		System.out.println("Digite um valor para Y");
		double y = scan.nextDouble();
		
		
		if (x == 0 && y == 0 ) {
			System.out.println("Origem");
		}else if (x == 0) {
			System.out.println("Eixo Y");
		}else if (y == 0) {
			System.out.println("Eixo X");
		}else if (x > 0 && y > 0) {
			System.out.println("Quadrante Q1");
		}else if (x < -0 && y > 0) {
			System.out.println("Quadrante Q2");
		}else if (x < -0 && y < -0) {
			System.out.println("Quadrante Q3");
		}else if (x > 0 && y < -0) {
			System.out.println("Quadrante Q4");
		}else {
			System.out.println("Cordenadas inválidas!!!");
		}
		
		scan.close();
	}

}
