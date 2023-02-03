package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ConselhoClasse;

public class ExerciciosTres {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ConselhoClasse cc = new ConselhoClasse();
		
		System.out.println("Name: ");
		cc.name = sc.next();
		
		System.out.println("First note: ");
		cc.note1 = sc.nextDouble();
		
		System.out.println("Second note: ");
		cc.note2 = sc.nextDouble();
		
		System.out.println("Third note: ");
		cc.note3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", cc.finalGrade());
		
		if(cc.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING $.2f POINTS%n", cc.missingPoints());
		}
		else {
			System.out.println("PASS");
		}
		
		sc.close();

	}

}
