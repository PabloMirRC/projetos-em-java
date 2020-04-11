package inter;
import java.util.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class list extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					list frame = new list();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public list() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	public void inicio() {
		
				

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

							convertido += "   ";

							break;
						}
					}
				}
				System.out.println("texto convertido");

				System.out.println(convertido);
			
		
	}

}
