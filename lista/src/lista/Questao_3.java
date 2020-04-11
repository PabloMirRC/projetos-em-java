package lista;

import java.util.Scanner;

public class Questao_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite as informações:");
		String ent_1 = sc.next();
		String ent_2 = sc.next();
		sc.close();
		sc.close();
		System.out.println("Ondem inversa:   " + ent_2);
		System.out.println();
		System.out.println(ent_1);
	}

}