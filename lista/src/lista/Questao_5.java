package lista;

import java.util.Scanner;

public class Questao_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os dois valores: ");
		int ent_1 = sc.nextInt(), ent_2 = sc.nextInt();
		int dif = ent_1 - ent_2;

		System.out.println("Diferença: " + dif);
		sc.close();
	}
}
