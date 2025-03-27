package aula_03;

import java.util.Scanner;

public class IfAninhado {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		
		//Coleta de Dados
		System.out.println("Digite seu tipo Sanguíneo (A, B, AB ou O): ");
		String tipo = scan.next();
		scan.nextLine();
		
		System.out.println("Digite seu fator RH (+ ou -): ");
		String rh = scan.next();
		scan.nextLine();
		
		//Estrutura Condicional
		
		if (tipo.equals("A")) { 
			if (rh.equals("+")) {
				System.out.println("Pode doar para A+ e AB+");
				System.out.println("Pode receber de A+, A-, O+ e O-");
			}else if (rh.equals("-")) {
				System.out.println("Pode doar para A+ , A-, AB+ e AB-");
				System.out.println("Pode receber de A- e O-");
			}else {
				System.out.println("RH inválido!");
				
			}
		}else if (tipo.equals("B")) { 
			if (rh.equals("+")) {
				System.out.println("Pode doar para B+ e AB+");
				System.out.println("Pode receber de B+, B-, O+ e O-");
			}else if (rh.equals("-")) {
				System.out.println("Pode doar para B+, B- AB+ e AB-");
				System.out.println("Pode receber de B- e O-");
			}else {
				System.out.println("RH inválido!");
				
			}
		}else if (tipo.equals("AB")) { 
			if (rh.equals("+")) {
				System.out.println("Pode doar para AB+");
				System.out.println("Pode receber de todos os tipos");
			}else if (rh.equals("-")) {
				System.out.println("Pode doar para AB+ e AB-");
				System.out.println("Pode receber de A-, B-, AB- e O-");
			}else {
				System.out.println("RH inválido!");		
			}
		}else if (tipo.equals("O")) { 
			if (rh.equals("+")) {
				System.out.println("Pode doar para A+ B+, AB+ e O+");
				System.out.println("Pode receber de O+ e O-");
			}else if (rh.equals("-")) {
				System.out.println("Pode doar para todos os tipos");
				System.out.println("Pode receber de O-");
			}else {
				System.out.println("RH inválido!");		
			}
		}else {
			System.out.println("Tipo sanguíneo inválido!");
		}
		
		scan.close();
			
		}

	}
