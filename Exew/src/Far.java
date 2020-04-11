import java.util.Locale;
import java.util.Scanner;

public class Far {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner (System.in);
		 char resp;
		 do {
			 System.out.println("digite a temperatura em celsius: ");
			 double c = sc.nextDouble();
			 double f = 9.0* c /5.0 + 23;
			 System.out.printf("o equivalente em fahrenheit: %.1f%n",f);
			 System.out.println("deseja repetir (s/n)");
			 resp = sc.next().charAt(0);
		 } while (resp!= 'n');
		 sc.close();
	}

}
