package lista_2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Questao_7 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		double result = 1;
		double vl1, vl2;
		vl1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
		vl2 = Double.parseDouble(JOptionPane.showInputDialog("digite o valor do expoente"));
		for (int i = 0; i < vl1; i++)
			result = result * vl2;
		sc.close();
		JOptionPane.showMessageDialog(null, " Resultado: "+ result);
	}
}