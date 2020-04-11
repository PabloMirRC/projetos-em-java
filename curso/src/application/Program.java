package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		System.out.println("digite os valores do triangulo A: ");

		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("digite os valores do triangulo B: ");

		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("area do triangulo A: %.4f%n", areaX);
		System.out.printf("area do triangulo B: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("A  maior area e do triangulo A");
		} else {
			System.out.println("A  maior area e do triangulo B");
		}
		sc.close();
	}

}
