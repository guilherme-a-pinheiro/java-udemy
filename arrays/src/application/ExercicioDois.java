package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ExercicioDoisProduct;

public class ExercicioDois {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ExercicioDoisProduct[] vect = new ExercicioDoisProduct[n];
		
		for(int i = 0; i< n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ExercicioDoisProduct(name, price);
		}
		
		double sum = 0.0;
		for(int i = 0; i < n; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / n;
		
		System.out.printf("Average price: %.2f%n", avg);
		
		sc.close();
	}
}
