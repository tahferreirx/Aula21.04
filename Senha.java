package Desafios;

import java.util.Scanner;

public class Senha {
	public static void main(String[] args) {
		
		int senhaMestre, senhaTentativa;
		double soma;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Cadastre uma senha (Apenas Números): ");
		senhaMestre = ler.nextInt();
		
		System.out.println("Digite um número: ");
		double número1 = ler.nextDouble();
		
		System.out.println("Digite um número: ");
		double número2 = ler.nextDouble(); 
		
		do {
			System.out.println("Digite a sua senha para desbloquear a soma: ");
			senhaTentativa = ler.nextInt();
		} 
		while ( senhaTentativa != senhaMestre);
		soma = número1 + número2;
		
		System.out.println("A soma dos números é " + soma);
		
		ler.close();
		
	}

}
