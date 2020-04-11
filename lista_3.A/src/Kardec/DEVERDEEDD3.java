package Kardec;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lista_3 {
	static void QUESTAO3() {
		Scanner sc = new Scanner(System.in);
		String[] opcoes = { "SOMA", "SUBTRAÇÃO", "MULTIPLICAÇÃO", "DIVISÃO" };
		int opcao = JOptionPane.showOptionDialog(null, "Escolha algo:", "E A VIDA", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
		if (opcao == JOptionPane.YES_OPTION) {
			String texto = JOptionPane.showInputDialog("MENU:\n - Digite um numeros");
			double x = Integer.parseInt(texto);
			String texto1 = JOptionPane.showInputDialog("MENU:\n - Digite um numeros");
			double y = Integer.parseInt(texto1);
			double soma = x + y;
			JOptionPane.showMessageDialog(null, "resultado da soma = " + (soma));
		} else if (opcao == JOptionPane.YES_OPTION + 1) {
			String texto = JOptionPane.showInputDialog("MENU:\n - Digite um numeros");
			double x = Integer.parseInt(texto);
			String texto1 = JOptionPane.showInputDialog("MENU:\n - Digite um numeros");
			double y = Integer.parseInt(texto1);
			double sub = x - y;
			JOptionPane.showMessageDialog(null, "resultado da soma = " + (sub));

		} else if (opcao == JOptionPane.YES_OPTION + 2) {
			String texto = JOptionPane.showInputDialog("MENU:\n - Digite um numeros");
			double x = Integer.parseInt(texto);
			String texto1 = JOptionPane.showInputDialog("MENU:\n - Digite um numeros");
			double y = Integer.parseInt(texto1);
			double mult = x * y;
			JOptionPane.showMessageDialog(null, "resultado da soma = " + (mult));
		} else if (opcao == JOptionPane.YES_OPTION + 3) {
			String texto = JOptionPane.showInputDialog("MENU:\n - Digite um numeros");
			double x = Integer.parseInt(texto);
			String texto1 = JOptionPane.showInputDialog("MENU:\n - Digite um numeros");
			double y = Integer.parseInt(texto1);
			double div = x / y;
			JOptionPane.showMessageDialog(null, "resultado da soma = " + (div));
		}
	}

	static void QUESTAO4() {
		Scanner sc = new Scanner(System.in);
		int cel = 10;
		for (int i = 0; i < cel; i++) {
			double far = 0;
			do {

				far = 9 * i / 5 + 32;
				System.out.println(("---O Valor Em  Celsius = " + i + "----") + "\n" + "---O Valor Em  Fahrenheit = "
						+ far + "----");
				i = i + 30;
			} while (i <= 270);
		}
	}

	static void QUESTAO5() {
		Scanner sc = new Scanner(System.in);
		String texto = JOptionPane.showInputDialog("MENU:\n - Digite Um Valor");
		String texto2 = JOptionPane.showInputDialog("MENU:\n - Digite Um Valor");
		String texto1 = JOptionPane.showInputDialog("MENU:\n - Digite um Valor");
		int x = Integer.parseInt(texto);
		int y = Integer.parseInt(texto1);
		int z = Integer.parseInt(texto2);
		if (x < y && x < z && z < y) {
			JOptionPane.showMessageDialog(null, ("Menor =" + x) + "\n" + ("Medio =" + z) + "\n" + ("Maior = " + y));
		} else if (x < y && x < z && z > y) {
			JOptionPane.showMessageDialog(null, ("Menor =" + x) + "\n" + ("Medio =" + y) + "\n" + ("Maior = " + z));
		} else if (x < y && x > z && z < y) {
			JOptionPane.showMessageDialog(null, ("Menor =" + z) + "\n" + ("Medio =" + x) + "\n" + ("Maior = " + y));
		} else if (x > y && x > z && z < y) {
			JOptionPane.showMessageDialog(null, ("Menor =" + z) + "\n" + ("Medio =" + y) + "\n" + ("Maior = " + x));
		} else if (x > y && x > z && z > y) {
			JOptionPane.showMessageDialog(null, ("Menor =" + y) + "\n" + ("Medio =" + z) + "\n" + ("Maior = " + x));
		} else if (x > y && x < z && z > y) {
			JOptionPane.showMessageDialog(null, ("Menor =" + y) + "\n" + ("Medio =" + x) + "\n" + ("Maior = " + z));
		}
	}

	static void QUESTAO6() {
		Scanner sc = new Scanner(System.in);// não pega nota quebrada
		double n1, n2, n3, media;

		String texto = JOptionPane.showInputDialog("MENU:\n - Digite a nota da lista de exercicios");
		String texto2 = JOptionPane.showInputDialog("MENU:\n - Digite a nota do seminario");
		String texto1 = JOptionPane.showInputDialog("MENU:\n - Digite a nota da prova");
		n1 = Double.parseDouble(texto);
		n2 = Double.parseDouble(texto1);
		n3 = Double.parseDouble(texto2);
		media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
		JOptionPane.showMessageDialog(null, ("nota final =") + media);

		if (media >= 6) {

			JOptionPane.showMessageDialog(null, "STATUS DO ALUNO :Aprovado");
		} else {
			JOptionPane.showMessageDialog(null, "STATUS DO ALUNO :Em construção");

		}
	}

	static void QUESTAO7() {
		Scanner sc = new Scanner(System.in);
		double v = 1;
		String texto = JOptionPane.showInputDialog("MENU:\n - digite um numero");
		int num = Integer.parseInt(texto);
		for (int x = 1; x <= num; x++) {
			v = v * x;
		}
		JOptionPane.showMessageDialog(null, " O resultado do fatorial = " + v);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] opcoes = { "QUESTAO3", "QUESTAO4", "QUESTAO5", "QUESTAO6", "QUESTAO7" };
		int opcao = JOptionPane.showOptionDialog(null, "Escolha algo:", "E A VIDA", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, opcoes, null);

		if (opcao == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "o programa sera iniciado...");
			QUESTAO3();
		} else if (opcao == JOptionPane.YES_OPTION + 1) {
			JOptionPane.showMessageDialog(null, "o programa sera iniciado...");
			QUESTAO4();
		} else if (opcao == JOptionPane.YES_OPTION + 2) {
			JOptionPane.showMessageDialog(null, "o programa sera iniciado...");
			QUESTAO5();
		} else if (opcao == JOptionPane.YES_OPTION + 3) {
			JOptionPane.showMessageDialog(null, "o programa sera iniciado...");
			QUESTAO6();
		} else if (opcao == JOptionPane.YES_OPTION + 4) {
			JOptionPane.showMessageDialog(null, "o programa sera iniciado...");
			QUESTAO7();
		}
			sc.close();
	}
}
