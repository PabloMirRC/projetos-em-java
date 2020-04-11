import java.util.Locale;
import java.util.Scanner;

public class Teste_100 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int idade,beber;
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		
		if (idade >= 18) {
			System.out.println("pode beber");
		} else {
			System.out.println("ESPERA ATE OS 18 BRO");
		}
		sc.close();
	}

}
