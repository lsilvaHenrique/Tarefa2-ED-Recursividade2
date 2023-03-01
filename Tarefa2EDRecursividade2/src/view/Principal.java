package view;

import controller.BinaryController;

public class Principal {
	 public static void main(String args[]){
	        int valor1 = 10;
	        int valor2 = 100;
	        int valor3 = 1000;
	        
	        BinaryController bi = new BinaryController();
	        
		 	System.out.println(bi.binary(valor1));    
	        System.out.println(bi.binary(valor2));     
	        System.out.println(bi.binary(valor3));      
	    }
	}

