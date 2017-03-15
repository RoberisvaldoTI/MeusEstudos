// Programa para calcular o valor da minha energia gasta

package br.com.rotecinformatica;

import java.util.Scanner;

public class UsandoIf {

	public static void main(String[] args) {
		
   // entrada
		
		Scanner entrada = new Scanner(System.in);
		
		double kwAtual,kwAnterior,totalkw,valorApagar,resto;
		
		System.out.println("Digite o kw Atual");
		kwAtual = entrada.nextDouble();
	
		System.out.println("Digite o   kw Anterior ");
		kwAnterior = entrada.nextDouble();
		
		System.out.println("Digite o Valor do Kw  ");
		valorApagar = entrada.nextDouble();
		
   // Processamento
		
		totalkw = kwAtual - kwAnterior;
		resto = totalkw * valorApagar;
		
		if( kwAtual <=0){
			System.out.println("Digite um valor maior que zero kilowatts Antual\n");
			
		}
		
		if(kwAnterior <=0){
			System.out.println("Digite um valor maior que zero kilowatts Anterior\n");
			
		}
		
   // Saída
		
		System.out.println("Seu consumo mensal e de: " +totalkw +" Kw/Mês\n");
		System.out.println("Valor da sua fatura Mensal  =  R$  "+resto +" Reais");

	
		entrada.close();
	}

}
