import java.util.Scanner;
public class Rabbatsystem {

   public static void main(String[] args) {
      Scanner tastatur = new Scanner(System.in);
      
      double bestellwert;
      int rabbat10 = 100;
      int rabbat15 = 500;

      // Eingabe
      System.out.print("Bitte geben Sie Ihren Bestellwert ein: ");
      bestellwert = tastatur.nextInt();
     
      if (bestellwert <= rabbat10) {
    	 bestellwert = bestellwert * 0.9; 
    	  
    	 
      } else if (bestellwert < rabbat15) {
    		bestellwert = bestellwert * 0.85;  
    	  
      
      } else if (bestellwert >= rabbat15) {
  		bestellwert = bestellwert * 0.8; 
	  System.out.print("Der Bestellwert abzüglich Rabbat beträgt: " + bestellwert + " EUR");
	  tastatur.close();
      }
    
   } 
}