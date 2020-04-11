package lista_2;

import javax.swing.JOptionPane;

public class Questao_5 {

	public static void main(String[] args) {

		int ent_1;
		ent_1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		if (ent_1 % 2 == 0)
			JOptionPane.showMessageDialog(null, "O valor e PAR");
		else {
			JOptionPane.showMessageDialog(null, "O valor e IMPAR");
		}

	}
}
