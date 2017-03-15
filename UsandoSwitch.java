package br.com.rotecinformatica;

import java.util.Scanner;

public class UsandoSwitch {

	public static void main(String[] args) {
		int entrada= 0;
		Scanner tecla = new Scanner(System.in);
		System.out.println("Digite numero da 1 a 10");
		entrada = tecla.nextInt();
		String numeroExtenso ="";
		
		switch (entrada){
		
		case 0:
		numeroExtenso = "Zero";
		break;
		
		case 1:
			numeroExtenso = "Um";
			break;
			
		case 2:
			numeroExtenso = "Dois";
			break;
			
		case 3:
			numeroExtenso = "Três";
			break;
			
		case 4:
			numeroExtenso = "Quatro";
			break;
			
		case 5:
			numeroExtenso = "Cinco";
			break;
			
		case 6:
			numeroExtenso = "Seis";
			break;
			
		case 7:
			numeroExtenso = "Sete";
			break;
			
		case 8:
			numeroExtenso = "Oito";
			break;
			
		case 9:
			numeroExtenso = "Nove";
			break;
		case 10:
			numeroExtenso = "Dez";
			break;
			
			default :
			numeroExtenso = " nao suportado";
		}
		
		System.out.println("Você digitou o numero: "+numeroExtenso);
		tecla.close();
		

	}

}
