package application;

import java.util.Locale;
import java.util.Scanner;



public class ex3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(new Locale("US"));
	
	
		System.out.println("qual o valor de k  ? ");
	    int k = sc.nextInt();
	    System.out.println("qual o valor de x ? ");
        int x = sc.nextInt();
      
        int fat = 1;
	     for (int i=1;i<=k;i++) {
	    	 
	    	 fat *= i;
	     }
	        System.out.printf("f(%d)=%d\n", x,fat);
        
        
        double s = 0,t;
        int n =1;
        for ( int i = 0; i<k; i++) {
        	t = Math.pow(x,i) / factorial(i) * n; 
        	n *= -1;
        	s += t;
        }
	
	    
        System.out.printf("sin(%d)=%f\n", x, s);
        
	sc.close();
	}

	public static double factorial(int k) {
		double aux = 1;
		for (int i = 3; i<= k;i= i + 2) {
			aux*=i;
			
		}
		return aux;
	}

}
