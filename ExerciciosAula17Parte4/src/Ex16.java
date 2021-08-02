package ExerciciosAula17;

import java.util.Scanner;

/*A série de Fibonacci é formada pela seqüência
0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até
que o valor seja maior que 500.*/

public class Ex16 {
	public static void main (String[] args){
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o valor para a série ultrapassar:");
		int valor = scan.nextInt();
		
		int primeiro = 1;
		int segundo = 1;
		int proximo = 0;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		for (int i = 3; proximo < valor; i++) {
			
			proximo = primeiro + segundo;
			segundo = primeiro;
			primeiro = proximo;
			System.out.println(proximo);
			
		}
		
		
	}

}
