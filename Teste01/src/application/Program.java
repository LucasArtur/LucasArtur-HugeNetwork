package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hora;
		int min;
		int sec;
		int modo;
		System.out.println("Digite a hora (1 até 12):");
		hora = sc.nextInt();
		System.out.println("Digite os minutos (entre 0 e 59):");
		min = sc.nextInt();
		System.out.println("Digite os segundos(entre 0 e 59):");
		sec = sc.nextInt();
		System.out.println("Digite o modo (entre 1 e 3):");
		modo = sc.nextInt();

		switch (modo) {
		case 1:
			double soma = (11 * min - 60 * hora) / 2;
			if (soma < 0) {
				soma = soma * -1;
				System.out.println("Resultado = " + soma + "º");
			} else {
				System.out.println("Resultado = " + soma + "º");
			}
			break;
		case 2:
			int soma2 = (11 * (sec / 60) - 60 * hora) / 2;
			if (soma2 < 0) {
				soma2 = soma2 * (-1);
				System.out.println("Resultado = " + soma2 + "º");
			} else {
				System.out.println("Resultado = " + soma2 + "º");
			}
			break;
		case 3:
			double soma3 = (11 * (sec / 60) - 60 * (min / 60)) / 2;
			if (soma3 < 0) {
				soma3= soma3 * -1;
				System.out.println("Resultado = " + soma3 + "º");
			} else {
				System.out.println("Resultado = " + soma3 + "º");
			}
			break;

		default:
			System.out.println("Digite um modo entre 1 e 3");
		}

		sc.close();

	}
}
