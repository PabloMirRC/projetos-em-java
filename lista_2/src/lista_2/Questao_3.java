package lista_2;

import javax.swing.JOptionPane;

public class Questao_3 {

	public static void main(String[] args) {
		int cel;
		cel = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor em celcius"));
		int fah = 9 * cel / 5 + 32;
		JOptionPane.showMessageDialog(null, " Valor em Fahrenheit: " + fah);
	}
}