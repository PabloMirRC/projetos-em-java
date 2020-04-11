import java.util.Scanner;

public class ExerciseW {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double senha = sc.nextDouble();
		String acertou = "finalmente voce acertou!!";
		while (senha != 2002) {
			System.out.println("ACESSO NEGADO: ");
			senha = sc.nextDouble();
		}

		System.out.println("acesso permitido: " + acertou);
		sc.close();
	}
}
