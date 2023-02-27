package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar?");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Digite um número:");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("Numeros Pares: ");
		
		int qtdPares = 0;
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] % 2 == 0) {
				System.out.println(vect[i]);
				qtdPares += 1;
			}
		}
		System.out.println("Quantidade de Pares = " + qtdPares);
		
		sc.close();
	}

}
