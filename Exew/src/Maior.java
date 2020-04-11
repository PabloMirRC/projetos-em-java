import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("digite 3 numeros: ");
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		 if (a > b && a > c) {
			 System.out.println("o maior e: " + a);
		 }else if(b > c) {
			 System.out.println("o maior e: " + b); 
		 } else {
			 System.out.println("o maior e: " + c);
		 }
		sc.close();
	}

}
