package application;

import xadrez.PecaXadrez;

public class UI {

	public static void printMesa(PecaXadrez[][] pecas) {
		
		for(int i = 0; i < pecas.length; i++) {
			System.out.print((8 - i) + " ");
		    for(int j = 0; j < pecas[i].length; j++) {
		        printPecas(pecas[i][j]);
		    }
		    System.out.println(" ");
		}
		System.out.println("  a b c d e f g h");
	}
	
	private static void printPecas(PecaXadrez peca) {
		if(peca == null) {
			System.out.print("-");
		}
		else {
			System.out.print(peca);
		}
		System.out.print(" ");
	}
}
