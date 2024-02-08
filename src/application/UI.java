package application;

import xadrez.PecaXadrez;

public class UI {

	public static void printMesa(PecaXadrez[][] pecas) {
		
		for(int i = 0; i < pecas.length; i++) {
		    for(int j = 0; j < pecas[i].length; j++) {
		        printPecas(pecas[i][j]);
		    }
		}
		}
	
	private static void printPecas(PecaXadrez peca) {
		if(peca == null) {
			System.out.println("-");
		}
		else {
			System.out.println(peca);
		}
		System.out.println(" ");
	}
}
