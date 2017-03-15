package br.com.rotecinformatica;

import java.util.Scanner;

public class IniciandoOperadores {

	public static void main(String[] args) {
		// Calculando o IMC.
		
		double  peso = 0;
		double altura = 0;
		double cal = 0;
		Scanner scan = new Scanner(System.in);
		
	System.out.println("Digite seu peso");
	
	    peso = scan.nextDouble();
	
    System.out.println("Digite sua altura");
	
	    altura = scan.nextDouble();
	
	    cal = peso / (altura*altura);
	    
	  System.out.println("Seu IMC é = " +cal);
	    
	    if(cal <= 25){
	    	System.out.println("vc esta dentro do peso");
	    	
	    }
	    else{
	    	System.out.println("vc esta acima do peso");
	    }
	   
	
	
	
	scan.close();
		
		

	}

}
