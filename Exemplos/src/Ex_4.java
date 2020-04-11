import java.util.Locale;
import java.util.Scanner;

public class Ex_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x;
		x= sc.nextDouble();
		System.out.printf("voce digitou:  %.3f%n", x);
		
		
		
		
		sc.close();
	}

}
