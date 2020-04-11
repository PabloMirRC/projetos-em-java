package lista;

import java.util.Scanner;

public class Questao_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite a sua idade: ");
		double idade = sc.nextDouble();
		if (idade < 2) {
			System.out.println("BEBÊ");
		}
		if (idade >= 3 && idade <= 11) {
			System.out.println(idade + "CRIANÇA");
		}
		if (idade > 12 && idade <= 17) {
			System.out.println(idade + " ADOLESCENTE");
		}
		if (idade > 18 && idade <= 24) {
			System.out.println(idade + " JOVEM");
		}
		if (idade > 25 && idade <= 59) {
			System.out.println(idade + "ADULTO");
		}
		if (idade > 60 && idade <= 99) {
			System.out.println(idade + "IDOSO");
		}
		if (idade >= 100) {
			System.out.println(idade + "ANCIÃO");
		}
		sc.close();
	}
}
