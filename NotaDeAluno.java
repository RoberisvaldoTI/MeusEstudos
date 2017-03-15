package br.com.rotecinformatica;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class NotaDeAluno {

	public static void main(String[] args) {
	
		double nota1= 0,nota2= 0,result= 0;
		
		// Entrada
		
		Scanner nota = new Scanner(System.in);
		
		//System.out.println("digite a primeira nota:");
		
		String n = JOptionPane.showInputDialog("Digite a primeira nota");
		nota1 = Double.parseDouble(n);
		
		// nota1 = nota.nextDouble();
		
		System.out.println("digite a segunda nota:");
		nota2 = nota.nextDouble();
		
		
		
		//Processamento
		
		result = (nota1 + nota2)/2;
		System.out.println(" Sua média foi = " +result);
		
		if(result > 7 ){
		System.out.println(" Você esta Aprovando");	
		}
		
		else if(result <= 6.9 && result >=1){
			System.out.println(" Você esta no exame final");
			
		}
		
		else{
			System.out.println(" Você esta reprovado");
		}
		
	
		
		//Saída
		
		//System.out.println(result);

		nota.close();

	}
	
	

}
