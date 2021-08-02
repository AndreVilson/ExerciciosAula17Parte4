package ExerciciosAula17;

import java.util.Scanner;

/*Altere o programa de cálculo do fatorial, permitindo ao usuário calcular
o fatorial várias vezes e limitando o fatorial a números inteiros positivos
e menores que 16.*/

public class Ex20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String continuar = "";

		do {

			System.out.println("Digite um número para calcular o fatorial:");
			int num = scan.nextInt();

			if (num > 0 && num < 16) {

				System.out.println(num + "! = ");

				int fatorial = 1;

				for (int i = num; i > 0; i--) {
					fatorial *= i;
					// fatorial = fatorial * i;
					System.out.println(i);
				}
				System.out.println("Resultado: " + fatorial);

				System.out.println("Digite 's' para continuar:");
				continuar = scan.next();
			}else {
				System.out.println("Valor Inválido!");
			}

		} while (continuar.equalsIgnoreCase("s"));

	}

}
