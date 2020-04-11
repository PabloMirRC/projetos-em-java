package inter;

import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class listas {

	private JPanel contentPane;
	private JTextField tx;
    double p,r,a;
	static void QUESTAO7() {
		
		

		char[] Letras = { ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

		String[] Morse = { "  ", "· -", "- · · ·", "- · - ·", "- · ·", "·", "· · - ·", "- - ·", "· · · ·", "· ·",
				"· - - -", "- · -", "· - · ·", "- -", "- ·", "- - -", "· - - ·", "- - · -", "· - ·", "· · ·", "-",
				"· · -", "· · · -", "· - -", "- · · -", "- · - -", "- - · ·", "- - - - -", "· - - - -", "· · - - -",
				"· · · - -", "· · · · -", "· · · · ·", "- · · · ·", "- - · · ·", "- - - · ·", "- - - - ·" };

		String conv = JOptionPane.showInputDialog("escreva algoma frase ");

		String convertido = "";

		conv = conv.toLowerCase();

		for (int i = 0; i < conv.length(); i++) {

			for (short j = 0; j < 37; j++) {

				if (conv.charAt(i) == Letras[j]) {

					convertido += Morse[j];

					convertido += "  ";

					
				}
			}
		}
		JOptionPane.showMessageDialog( null,"texto modificado para morse "+"\n"+convertido);

}
	
	public static void main(String[] args) {
		
	}

}
