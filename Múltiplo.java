package Desafios;

import java.util.Scanner;

public class Múltiplo {
public static void main(String[] args) {
		
		double valor;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		valor = ler.nextDouble();
		
		String mensagem = valor % 5 == 0 ? "É múltiplo de 5" : "Não é múltiplo de 5";
		System.out.println(mensagem);
		
		ler.close();
		
	}

}
