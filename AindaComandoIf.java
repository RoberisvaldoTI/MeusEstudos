package br.com.rotecinformatica;

import java.util.Scanner;

public class AindaComandoIf {

	public static void main(String[] args) {
	
		// Entrada
		
Scanner entrada = new Scanner(System.in);
double consumoKW = 0;
double valorPago = 0;

System.out.println("Digite a sua leitura anterior em KW");
consumoKW = entrada.nextDouble();
/*
 * < 10 0.50 ==> centavos
 * >= 10 e < 100 ==> 0.72 centavos.
 * >= 100  ==> 1.000 Reais.
 */


// Processamento

if(consumoKW == 0){
	System.out.println("Voce não consumiu energia");
	
}

else if(consumoKW < 0){
	System.out.println("Erro!!! valor não pode ser negativo");
}

else if (consumoKW > 0 && consumoKW < 10){
	valorPago = consumoKW * 0.5;
	
}

else if(consumoKW >= 10 && consumoKW < 100){
	valorPago = consumoKW * 0.72;
	
}

else if(consumoKW >= 100){
	valorPago = consumoKW * 1;
	
}


// Saída

System.out.println("O valor a pagar = "+valorPago);
entrada.close();
	}

}
