package lIsta_3;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Program {

	static void questao_3() {

		Scanner sc = new Scanner(System.in);
		String[] opcoes = { "SOMA", "SUBTRAÇÃO", "MULTIPLICAÇÃO", "DIVISÃO" };
		int opcao = JOptionPane.showOptionDialog(null, "SELECIONE UMA DAS OPÇÃOES:", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
		if (opcao == JOptionPane.YES_OPTION) {
			String texto = JOptionPane.showInputDialog("MENU:\n - Digite um valor: ");
			double x = Integer.parseInt(texto);
			String texto1 = JOptionPane.showInputDialog("MENU:\n - Digite um valor:");
			double y = Integer.parseInt(texto1);
			double soma = x + y;
			JOptionPane.showMessageDialog(null, "Resultado da soma: =  " + (soma));
		} else if (opcao == JOptionPane.YES_OPTION + 1) {
			String texto = JOptionPane.showInputDialog("MENU:\n - Digite um valor: ");
			double x = Integer.parseInt(texto);
			String texto1 = JOptionPane.showInputDialog("MENU:\n - Digite um valor: ");
			double y = Integer.parseInt(texto1);
			double sub = x - y;
			JOptionPane.showMessageDialog(null, "Resultado da soma: = " + (sub));

		} else if (opcao == JOptionPane.YES_OPTION + 2) {
			String texto = JOptionPane.showInputDialog("MENU:\n - Digite um valor: ");
			double x = Integer.parseInt(texto);
			String texto1 = JOptionPane.showInputDialog("MENU:\n - Digite um valor: ");
			double y = Integer.parseInt(texto1);
			double mult = x * y;
			JOptionPane.showMessageDialog(null, "Resultado da soma: = " + (mult));
		} else if (opcao == JOptionPane.YES_OPTION + 3) {
			String texto = JOptionPane.showInputDialog("MENU:\n - Digite um valor: : ");
			double x = Integer.parseInt(texto);
			String texto1 = JOptionPane.showInputDialog("MENU:\n - Digite um valor: ");
			double y = Integer.parseInt(texto1);
			double div = x / y;
			JOptionPane.showMessageDialog(null, "Resultado da soma: = " + (div));
			sc.close();
		}
	}

	static void questao_4() {
		Scanner sc = new Scanner(System.in);
		int cel = 10;
		for (int i = 0; i < cel; i++) {
			double far = 0;
			do {

				far = 9 * i / 5 + 32;
				System.out.println(
						("---O Valor Em  Celsius: = " + i + "---") + "\n" + "Valor Em  Fahrenheit: = " + far + "---");
				i = i + 30;
			} while (i <= 270);
			sc.close();
		}
	}

	static void questao_5() {
		Scanner sc = new Scanner(System.in);
		String texto = JOptionPane.showInputDialog("MENU:\n - Digite Um Valor");
		String texto2 = JOptionPane.showInputDialog("MENU:\n - Digite Um Valor");
		String texto1 = JOptionPane.showInputDialog("MENU:\n - Digite um Valor");
		int x = Integer.parseInt(texto);
		int y = Integer.parseInt(texto1);
		int z = Integer.parseInt(texto2);

		if (x < y && x < z && z < y) {
			JOptionPane.showMessageDialog(null, (x) + "\n" + (z) + "\n" + (y));
		} else if (x < y && x < z && z > y) {
			JOptionPane.showMessageDialog(null, (x) + "\n" + (y) + "\n" + (z));
		} else if (x < y && x > z && z < y) {
			JOptionPane.showMessageDialog(null, (z) + "\n" + (x) + "\n" + (y));
		} else if (x > y && x > z && z < y) {
			JOptionPane.showMessageDialog(null, (z) + "\n" + (y) + "\n" + (x));
		} else if (x > y && x > z && z > y) {
			JOptionPane.showMessageDialog(null, (y) + "\n" + (z) + "\n" + (x));
		} else if (x > y && x < z && z > y) {
			JOptionPane.showMessageDialog(null, (y) + "\n" + (x) + "\n" + (z));
		}
		sc.close();
	}

	static void questao_6() {
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, media;

		String texto = JOptionPane.showInputDialog("MENU:\n - Digite o valor  da nota da lista de exercı́cios: ");
		String texto2 = JOptionPane.showInputDialog("MENU:\n - Digite o valor da nota do seminario: ");
		String texto1 = JOptionPane.showInputDialog("MENU:\n - Digite o valor da nota da prova: ");

		n1 = Double.parseDouble(texto);
		n2 = Double.parseDouble(texto1);
		n3 = Double.parseDouble(texto2);
		media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
		JOptionPane.showMessageDialog(null, ("Resultado final: =") + media);
		sc.close();
		if (media >= 6)
			JOptionPane.showMessageDialog(null, "STATUS: Aprovado.");
		else {
			JOptionPane.showMessageDialog(null, "STATUS: Em construção.");
		}
	}

	static void questao_7() {
		Scanner sc = new Scanner(System.in);
		double v = 1;
		String texto = JOptionPane.showInputDialog("MENU:\n - Digite um valor: ");
		int num = Integer.parseInt(texto);
		for (int x = 1; x <= num; x++) {
			v = v * x;
		}
		sc.close();
		JOptionPane.showMessageDialog(null, "O resultado do valor em fatorial: = " + v);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] opcoes = { "Questao_3", "Questao_4", "Questao_5", "Questao_6", "Questao_7" };
		int opcao = JOptionPane.showOptionDialog(null, "SELECIONE UMA DAS OPÇÃOES:", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, null);

		if (opcao == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "O programa esta iniciado..");
			questao_3();
		} else if (opcao == JOptionPane.YES_OPTION + 1) {
			JOptionPane.showMessageDialog(null, "O programa esta iniciado..");
			questao_4();
		} else if (opcao == JOptionPane.YES_OPTION + 2) {
			JOptionPane.showMessageDialog(null, "O programa esta iniciado..");
			questao_5();
		} else if (opcao == JOptionPane.YES_OPTION + 3) {
			JOptionPane.showMessageDialog(null, "O programa esta iniciado..");
			questao_6();
		} else if (opcao == JOptionPane.YES_OPTION + 4) {
			JOptionPane.showMessageDialog(null, "O programa esta iniciando..");
			questao_7();
		}
		sc.close();
	}
}