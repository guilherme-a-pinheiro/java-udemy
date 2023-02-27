package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.println("Valores = ");
		for(int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		double sum = 0.0;
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}
		System.out.printf("Soma = %.2f%n", sum);
		
		
		double media = sum / n;
		System.out.printf("Media = %.2f%n", media);
				
		sc.close();

	}

}
