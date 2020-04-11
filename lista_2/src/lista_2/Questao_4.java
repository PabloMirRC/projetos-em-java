package lista_2;

import javax.swing.JOptionPane;

public class Questao_4 {

	public static void main(String[] args) {

		double vl1, vl2, vl3, vl4, vl5, vl6, vl7;
		vl1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
		vl2 = Double.parseDouble(JOptionPane.showInputDialog("digite o segundo valor"));
		vl3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceito valor"));
		vl4 = Double.parseDouble(JOptionPane.showInputDialog("digite o quarto valor"));
		vl5 = Double.parseDouble(JOptionPane.showInputDialog("Digite o quinto valor"));
		vl6 = Double.parseDouble(JOptionPane.showInputDialog("digite o sexto valor"));
		vl7 = Double.parseDouble(JOptionPane.showInputDialog("Digite o setimo valor"));

		int media = (int) (vl1 + vl2 + vl3 + vl3 + vl4 + vl5 + vl6 + vl7 / 7);
		JOptionPane.showMessageDialog(null, " Media do valor " + media);
	}
}
