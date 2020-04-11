import java.util.Scanner;

public class Ex_10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int n = sc.nextInt();
		
		if(n % 2==0) {
			System.out.println("par");
		}
		else {
			System.out.println("ímpar");
		}
		sc.close();
			}

}
