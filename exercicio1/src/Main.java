import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vl1, vl2,soma ;
		
		vl1 = sc.nextInt();
		vl2 = sc.nextInt();
		
		 soma = vl1 + vl2;
		
		System.out.println("o valor da Soma e:" + soma);

		sc.close();
	}

}
