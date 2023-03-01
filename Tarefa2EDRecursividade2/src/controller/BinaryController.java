package controller;

public class BinaryController {
	public BinaryController() {}
	
	public String binary(int num){
        String b = " "; // string vazia para concatenar os valores binarios
        // Condicao de parada --> Quando num for igual a 0 
        if (num == 0) {  
            return "0"; 
        } else if(num == 1) {
            return "1"; 
        } else {
            return b + binary(num/2)+(num%2);
            /*
              100 / 2 = 50 (0)
              50 / 2 = 25  (0)
              25 / 2 = 12  (1)
              12 / 2 = 6   (0) 
           	  6 / 2 = 3    (0)
           	  3 / 2 = 1	   (1)
           	  1 / 2 = 0    (1)	    	
             */
        }
    }
    
}
