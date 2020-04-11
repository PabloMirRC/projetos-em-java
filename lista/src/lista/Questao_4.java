package lista;

import java.util.Scanner;

public class Questao_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor");
		double ent = sc.nextDouble();
		if (ent < 10) {
			System.out.println("Esse número é menor que 10");
		} else {
			System.out.println("Esse número é maior que 10");
			sc.close();
		}
	}

}
