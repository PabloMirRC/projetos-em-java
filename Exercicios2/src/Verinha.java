import java.util.Locale;
import java.util.Scanner;

public class Verinha {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("digite 1 para saber se pode beber");
		System.out.println("digite 2 para saber se pode se aposentar ");
		System.out.println("digite 3 para saber se pode dirigir");
		int idade = sc.nextInt();
		double falta,falta2,falta1;
		
		switch (idade) {
		case 1:
			System.out.println("digite sua idade para saber se pode beber");
			int idade1 = sc.nextInt();
			if (idade1 >= 18) 
				System.out.println("pode beber! ");
			else {
				falta1 = 18 - idade1;
				System.out.printf("Faltam %.2f anos para você poder beber", falta1);
			}
			break;
		case 2:
			System.out.println("digite sua idade para saber se pode se aposentar: ");
			System.out.println("   ");
			double idade2 = sc.nextDouble();
			if (idade2 >= 65) 
				System.out.println("pode se aposentar! ");
			 else {
				falta = 65 - idade2;
				System.out.printf("faltam esses %.2f%n anos para se aposentar ", falta);
			
			}
			break;
		case 3:
			System.out.println("digite sua idade para saber se pode dirigir:  ");
			System.out.println("  ");
			double idade3 = sc.nextDouble();
			if (idade3 >= 18) 
				System.out.println("pode dirigir");
			 else {
				falta2 = 18 - idade3;
				System.out.println("ainda nao pode dirigir!");
				System.out.printf("ainda faltam %.2f anos para você poder dirigir ", falta2);
			}
			break;
		default:
			System.out.println("Essa opção não e valida");
		}
		sc.close();
		sc.close();
		sc.close();
		sc.close();
	}

}
