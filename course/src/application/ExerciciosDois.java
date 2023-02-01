package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class ExerciciosDois {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rg = new Rectangle();

		System.out.println("Enter rectangle width and height: ");
		rg.height = sc.nextDouble();
		rg.width = sc.nextDouble();
		
		System.out.printf("Area: %.2f%n", rg.area());
		System.out.printf("Perimeter: %.2f%n", rg.perimeter());
		System.out.printf("Diagonal: %.2f%n", rg.diagonal());
	}

}
