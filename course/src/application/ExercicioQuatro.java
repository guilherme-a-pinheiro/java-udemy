package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CalculatorRadius;

public class ExercicioQuatro {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = CalculatorRadius.circumference(radius);
		
		double v = CalculatorRadius.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		
		System.out.printf("Volume: %.2f%n", v);
		
		System.out.printf("PI: %.2f%n", CalculatorRadius.PI);
		
		sc.close();
	}


}
