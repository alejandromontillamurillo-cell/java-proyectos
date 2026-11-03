package martes;

import java.util.Scanner;

public class Practica_8_b_6 {
  public static void main(String[] args) {
	  
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce altura:");
    int n = sc.nextInt();
    
    System.out.println("Introduce carácter de relleno:");
    String c = sc.next();
    
    for (int i = 1; i <= n; i++) {  
      for (int j = 1; j <= n-i; j++) { 
            System.out.print(" ");
          }  	
      for (int k = 1; k <= (i*2)-1; k++) {
    	  if ((k==1) || (k==(i*2)-1) || (i==n))  
    		  System.out.print(c);
    	  else 
    		  System.out.print(" ");
      }
      System.out.println();
    }
  }
}