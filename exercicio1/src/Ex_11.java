import java.util.Scanner;

public class Ex_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a % b== 0 || b % a == 0) 
			System.out.println("SAO MULTIPLOS ");
		
		else {
		System.out.println("nao sao multiplos");
		}
		
		sc.close();

	}

}
