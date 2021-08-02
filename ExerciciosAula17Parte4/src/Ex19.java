package ExerciciosAula17;

import java.util.Scanner;

/*Altere o programa anterior para que ele aceite apenas números entre 0
e 1000.*/
public class Ex19 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Quantos numeros irá inserir?");
		int num = scan.nextInt();
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;

		boolean sair = false;

		int numDigitados = 0;
		int total = 0;
		int i = 0;
			
		while (sair == false && i < num) {
			
			for ( i = 0; i < num; i++) {

				numDigitados = scan.nextInt();

				if (numDigitados >= 0 && numDigitados <= 1000) {

					total = numDigitados + total;

					if (numDigitados < menor) {
						menor = numDigitados;
					}
					if (numDigitados > maior) {
						maior = numDigitados;
					}

				} else {
					System.out.println("Valor Inválido!");
					sair = true;
				}
			}
		}
				System.out.println("Menor número digitado : " + menor);
				System.out.println("Maior número digitado : " + maior);
				System.out.println("total: " + total);
	}

}
