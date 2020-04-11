package lista_2;

import javax.swing.JOptionPane;

class Questao_6 {

	public static void main(String args[]) {
		int b, a, scap;
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 1"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 2"));

		if ((a >= b)) {
			scap = a;
			a = b;
			b = scap;
		}
		if ((b >= a)) {
			scap = b;
			b = a;
			a = scap;
		}
		if ((a >= b)) {
			scap = a;
			a = b;
			b = scap;
		}
		JOptionPane.showMessageDialog(null, " ordem crescente dos numeros = " + a + " - " + b);
	}

}
