package caixa;

import javax.swing.JOptionPane;

public class Caixa_Mercado {
	static void preco() {
        do {
		double valorDoProduto, somaDoProduto = 0;

		String valor = JOptionPane.showInputDialog("Digite o valor do Primeiro Produto");
		valorDoProduto = Double.parseDouble(valor);
		somaDoProduto += valorDoProduto;

		String[] adc = { "adicionar, continuar " };
		int opcao = JOptionPane.showOptionDialog(null, "Caixa 1: ", "Lojinha da informática",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, adc, null);

		if (opcao == JOptionPane.YES_OPTION) {
			valor = JOptionPane.showInputDialog("Digite o valor a ser adcionado");
			preco();
		} else if (opcao == JOptionPane.YES_OPTION + 1) {

		}

		JOptionPane.showMessageDialog(null, ("Valor total dos produtos " + somaDoProduto));

		String[] opcoes1 = { "CARTãO DE CREDITO", "DINHEIRO", "CHEQUE" };

		int opcao1 = JOptionPane.showOptionDialog(null, "CAIXA NOTA BOA: FORMA DE PAGAMENTO", "MERCADO BOA NOTA",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes1, null);
		if (opcao1 == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "podemos parcelar em ate 10x");
			String[] opcoes2 = { "PARCELAR EM 2X", "PARCELAR EM 3X", "PARCELAR EM 4X", "PARCELAR EM 5X",
					"PARCELAR EM 6X", "PARCELAR EM 7X", "PARCELAR EM 8X", "PARCELAR EM 9X", "PARCELAR EM 10X" };
			int opcao2 = JOptionPane.showOptionDialog(null, "CAIXA NOTA BOA: PARCELAR EM QUANTAS VEZES?",
					"MERCADO BOA NOTA", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes2,
					null);

			double valoa;
			if (opcao2 == JOptionPane.YES_OPTION) {
				valoa = somaDoProduto / 2;
				JOptionPane.showMessageDialog(null, "S�O 2 PARCELAS DE = " + valoa);
			} else if (opcao2 == JOptionPane.YES_OPTION + 1) {
				valoa = somaDoProduto / 3;
				JOptionPane.showMessageDialog(null, "S�O 3 PARCELAS DE = " + valoa);
			} else if (opcao2 == JOptionPane.YES_OPTION + 2) {
				valoa = somaDoProduto / 4;
				JOptionPane.showMessageDialog(null, "S�O 4 PARCELAS DE = " + valoa);
			} else if (opcao2 == JOptionPane.YES_OPTION + 3) {
				valoa = somaDoProduto / 5;
				JOptionPane.showMessageDialog(null, "S�O 5 PARCELAS DE = " + valoa);
			} else if (opcao2 == JOptionPane.YES_OPTION + 4) {

				valoa = somaDoProduto / 6;
				JOptionPane.showMessageDialog(null, "S�O 6 PARCELAS DE = " + valoa);
			} else if (opcao2 == JOptionPane.YES_OPTION + 5) {

				valoa = somaDoProduto / 7;
				JOptionPane.showMessageDialog(null, "S�O 7 PARCELAS DE = " + valoa);
			} else if (opcao2 == JOptionPane.YES_OPTION + 6) {

				valoa = somaDoProduto / 8;
				JOptionPane.showMessageDialog(null, "S�O 8 PARCELAS DE = " + valoa);
			} else if (opcao2 == JOptionPane.YES_OPTION + 7) {

				valoa = somaDoProduto / 9;
				JOptionPane.showMessageDialog(null, "S�O 9 PARCELAS DE = " + valoa);
			} else if (opcao2 == JOptionPane.YES_OPTION + 8) {

				valoa = somaDoProduto / 10;
				JOptionPane.showMessageDialog(null, "S�O 10 PARCELAS DE = " + valoa);
			}
		}

		else if (opcao1 == JOptionPane.YES_OPTION + 1) {
			JOptionPane.showMessageDialog(null, "VOC� RECEBEU 10% DE DESCONTO ");
			double valoi;
			valoi = somaDoProduto - (somaDoProduto * 0.10);
			JOptionPane.showMessageDialog(null, valoi);
			String texto3 = JOptionPane.showInputDialog("valor recebido pelo cliente");
			double h = Double.parseDouble(texto3);

			h -= valoi;
			JOptionPane.showMessageDialog(null, "troco = " + h);
		}

		else if (opcao1 == JOptionPane.YES_OPTION + 2) {
			JOptionPane.showMessageDialog(null, "podemos parcelar em ate 3x");
			String[] opcoes3 = { "A VISTA", " PARCELAR EM 2X", "PARCELAR EM 3X" };
			int opcao3 = JOptionPane.showOptionDialog(null, "CAIXA NOTA BOA: PARCELAR EM QUANTAS VEZES?",
					"MERCADO BOA NOTA", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes3,
					null);

			double valoe;
			if (opcao3 == JOptionPane.YES_OPTION) {
				valoe = somaDoProduto - (somaDoProduto * 0.05);
				JOptionPane.showMessageDialog(null, valoe);
				String texto4 = JOptionPane.showInputDialog("valor recebido pelo cliente");
				double n = Integer.parseInt(texto4);
				n -= valoe;
				JOptionPane.showMessageDialog(null, "troco = " + n);
			} else if (opcao3 == JOptionPane.YES_OPTION + 1) {
				valoe = somaDoProduto / 2;
				JOptionPane.showMessageDialog(null, valoe);
				String texto3 = JOptionPane.showInputDialog("valor recebido pelo cliente");
				double u = Integer.parseInt(texto3);
				u -= valoe;
				JOptionPane.showMessageDialog(null, "troco = " + u);
			} else if (opcao3 == JOptionPane.YES_OPTION + 2) {
				valoe = somaDoProduto / 3;
				JOptionPane.showMessageDialog(null, valoe);
				String texto3 = JOptionPane.showInputDialog("valor recebido pelo cliente");
				double j = Double.parseDouble(texto3);
				j -= valoe;
				JOptionPane.showMessageDialog(null, "troco = " + j);
			}
		}
	}

	public static void main(String[] args) {
		String[] opcoes = { "PASSAR PRE�OS", "FECHAR" };
		int opcao = JOptionPane.showOptionDialog(null, "CAIXA NOTA BOA:", "MERCADO BOA NOTA",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, null);

		if (opcao == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "o programa sera iniciado...");
			preco();
		} else if (opcao == JOptionPane.YES_OPTION + 1) {
			JOptionPane.showMessageDialog(null, "o programa sera FECHADO...");
		}
	}
}
