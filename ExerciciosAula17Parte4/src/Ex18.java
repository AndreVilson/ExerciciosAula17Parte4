package ExerciciosAula17;

import java.util.Scanner;

/*Faça um programa que, dado um conjunto de N números, determine o
menor valor, o maior valor e a soma dos valores.*/

public class Ex18 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Quantos numeros irá inserir?");
		int num = scan.nextInt();
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		// System.out.println("Menor teste: " + menor);
		// System.out.println("Maior teste : " + maior);

		int numDigitados = 0;
		int total = 0;

		for (int i = 0; i < num; i++) {
			numDigitados = scan.nextInt();
			total = numDigitados + total;

			if (numDigitados < menor) {
				menor = numDigitados;
			}
			if (numDigitados > maior) {
				maior = numDigitados;
			}
		}

		System.out.println("Menor número digitado : " + menor);
		System.out.println("Maior número digitado : " + maior);
		System.out.println("total: " + total);

	}

}
