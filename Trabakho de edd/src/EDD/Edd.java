package EDD;

import java.util.Random;

import javax.swing.JOptionPane;

public class Edd {
	public static void main(String[] args) {
		Random gerador = new Random();
		int linha = gerador.nextInt(3)+1;
		int matriz[][] = new int[linha][linha];
		int determinante = 0;
		for(int a = 0; a < matriz.length; a++) {
			for(int b = 0; b < matriz[a].length; b++) {
				matriz[a][b] = gerador.nextInt(10);
			}
		}
		int contador = 0;
		int cont = 0;
		int c = 0;
		for(int y = 0; y < matriz.length; y++) {
			for(int k = 0; k < matriz[y].length; k++){
				if(linha == 1) {
					contador = matriz[y][k];
				}else if(linha == 2) {
					cont = matriz[0][0] * matriz[1][1] - matriz[1][0] * matriz[0][1];
				}else if(linha == 3) {

				}
			}
		}
		for(int s = 0; s < linha; s++) {
			for(int r = 0; r < linha; r++) {
				System.out.print("[" + matriz[s][r] + "]");
			}
			System.out.println();
		}
		if(linha == 1) {
			System.out.println("Determinante da matriz é = " + contador);
		}else if(linha == 2){
			System.out.println("Determinante da matriz é = " + cont);
		}
	}
}