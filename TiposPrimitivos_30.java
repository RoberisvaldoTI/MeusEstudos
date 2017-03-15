package br.com.rotecinformatica;

public class TiposPrimitivos_30 {

	
	public static void main(String[] args) {
		
		 int num1 = 4;
	        byte idade = 1;
	        long velocidade = 8; //Obs: A declaração de um número inteiro longo deve ser feita utilizando-se a letra L como sufixo. 
	        short salario = 2;
	     //Números que podem conter partes fracionárias podem ser representados por dois tipos:
	        double doub = 8;
	        float teste = 4; // Obs: A declaração de um número como um float, deve ser feito utilizando a letra F como sufixo.
	        char n1 = '%';
	        boolean bool = false;
	        
	        System.out.println("Int    =  4 bytes  (-2.147.483.648) Até    2.147.483.648)"+ num1);
	        System.out.println("Byte   =  1 bytes  (-128) até (127)"+idade);
	        System.out.println("Long   =  8 bytes  (-9.223.372.036.854.775.808) Até (+9.223.372.036.854.775.807)"+velocidade);
	        System.out.println("Short  =  2 bytes  (-32.768) Até (+32.767)"+salario);
	        System.out.println("Double =  8 bytes  (-1,7976E + 308) Até (+1,7976E + 308)( 15 Digitos)"+doub );
	        System.out.println("Float  =  4 bytes  (-3,4028E + 38) Até (+3,4028E + 38) (6 a 7 digito)"+teste);
	        System.out.println("Recebe o valor = (true ou false( 0 uo 1)"+bool);
	        System.out.println("Recebe um caractere = "+n1);
	   
	   }
	
	}


