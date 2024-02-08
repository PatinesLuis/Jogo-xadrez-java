package xadrez;

import tabuleiro.MesaTabuleiro;

public class PartidaXadrez {
	private MesaTabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new MesaTabuleiro(8, 8);
	}
	
	public PecaXadrez[][] getPecas(){
		PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i=0; i<tabuleiro.getLinhas(); i++) {
			for(int j=0; j<tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaXadrez)tabuleiro.peca(i, j);
			}
		}
		return mat;
	}
}
