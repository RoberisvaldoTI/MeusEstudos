
package br.com.rotecinformatica;

import java.util.Scanner;

public class UsandoEntradaCast {

	public static void main(String[] args) {
		
		
	// Entrada
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o Ano Atual");
		int anoAtual = entrada.nextInt();
		
		System.out.println("Digite o Ano do Seu Nascimento");
		int anoNascimento = entrada.nextInt();
		
		System.out.println("Digite se peso");
		double peso = entrada.nextDouble();
		
		System.out.println("Digite a sua altura");
	     double altura = entrada.nextDouble();
		
	// Processamento
		int idade = anoAtual - anoNascimento;
		int imc = (int)( peso / (altura * altura));
		
		
   // Saída
         System.out.println("Sua idade e = " +idade +" Anos.");
         System.out.println("seu IMC = "+imc);
      entrada.close();   
	}

}
