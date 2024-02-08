package application;

import tabuleiro.MesaTabuleiro;
import tabuleiro.Posicao;
import xadrez.PartidaXadrez;

public class Program {
	public static void main(String[] args) {
		
		PartidaXadrez px = new PartidaXadrez();
		UI.printMesa(px.getPecas());
	}
}
