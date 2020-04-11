import java.util.Locale;
import java.util.Scanner;

public class Pt_flu {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double a,b,c, triangulo,circulo,trapezio,quadrado,retangulo;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		triangulo = a *c/2.0;
		circulo = 3.14159*c*c;
		trapezio = (a + b) / 2.0 * c;
		quadrado = b*b;
		retangulo = a*b;
		
		System.out.printf("Triangulo = %.3f%n",triangulo);
		System.out.printf("Circulo = %.3f%n",circulo);
		System.out.printf("Trapezio = %.3f%n ", trapezio);
		System.out.printf("Quadrado = %.3f%n", quadrado);
		System.out.printf("Retangulo = %.3f%n", retangulo);
		
		sc.close();

	}

}
