package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(new Locale("US"));

		double z = 60.00;
		double x = 6.0;
		double soma = 0;
		double y;

		double multz = z*59.0*58.0*57.0*56.0*55.0;
		
		System.out.println("Digitie quantos números quer apostar(6,7 ou 8)");
		y = sc.nextDouble();

		if (y == 6) {
			//36045979200.00
			soma = multz / fatorial(x) ;
			System.out.printf("Sua chance de ganhar é 1: %.0f  ",soma);
		}

		else {
			soma = fatorial(y) /  fatorial(y - x) ;
			soma /= fatorial(x);
			soma = 50063860/soma;
			System.out.printf("Sua chance de ganhar é 1: %.0f ",soma);
		}

		sc.close();
	}

	public static double fatorial(double y) {
		double aux = 1;
		for (int i = 2; i <= y; i++) {
			aux *= i;
		}
		return aux;

	}

}
