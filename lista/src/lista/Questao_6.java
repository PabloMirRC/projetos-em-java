package lista;

import java.util.Scanner;

public class Questao_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois valores:");
		int ent_1 = sc.nextInt(), ent_2 = sc.nextInt();
		int dif = ent_1 - ent_2;

		if (dif < 10)
			System.out.println("A diferença é menor que 10.");
		else {
			System.out.println("A diferença é maior que 10.");
			sc.close();
		}
	}

}
