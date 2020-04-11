import java.util.Scanner;

public class Ex_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int hora;
		System.out.println("quantas horas?");
		hora = sc.nextInt();
		
		if(hora < 12) {
			System.out.println("boa dia!");
		}
		else {
			if(hora < 18){
				System.out.println("boa tarde!");
			}
			else {
				System.out.println("boa noite");
			}
			
		}
		
			sc.close();
		}
		

	}

