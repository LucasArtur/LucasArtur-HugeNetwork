package application;

import java.util.Locale;
import java.util.Scanner;

public class ex3b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(new Locale("US"));
		
		
			System.out.println("qual o valor de k  ? ");
		    int k = sc.nextInt();
		    System.out.println("qual o valor de x ? ");
	        int x = sc.nextInt();
	     
	        
	        double s = 0,t;
	        int n =1;
	        for ( int i = 0; i<k; i++) {
	        	t = Math.pow(x,i) / factorial(i) * n; 
	        	n *= -1;
	        	s += t;
	        }
		
		
	        System.out.printf("f(%d)=%f\n", x,s);
	        
		sc.close();
		}

		public static double factorial(int k) {
			double aux = 1;
			for (int i = 2; i<= k;i= i+=2) {
				aux*=i;
				
			}
			return aux;
		}

	}