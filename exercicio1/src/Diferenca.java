import java.util.Locale;
import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Locale.setDefault(Locale.US);
	  Scanner sc = new Scanner (System.in);
	  double A,B,C,D, dif;
	  
	  A = sc.nextDouble();
	  B = sc.nextDouble();
	  C = sc.nextDouble();
	  D = sc.nextDouble();
	  dif = (A*B- C*D);
	  System.out.println("DIFERENÇA =" + dif);
	  
	  sc.close();

	}

}
