import java.util.Random;

public class q04{
public static void main(String[] args) {
String letras = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		Random r = new Random();
		byte PL = (byte) r.nextInt(letras.length());
		byte PL1 = (byte) r.nextInt(letras.length());
		byte PL2 = (byte) r.nextInt(letras.length());
		System.out.print(letras.charAt(PL));
		System.out.print(letras.charAt(PL1));
		System.out.print(letras.charAt(PL2));
		int n[] = new int[4];
		for (int i = 0; i < n.length; i++) {
			n[i] = r.nextInt(9);
			System.out.print(n[i]);
		}
	}
}