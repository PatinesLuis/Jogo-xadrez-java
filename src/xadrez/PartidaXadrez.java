package xadrez;

import tabuleiro.MesaTabuleiro;
import tabuleiro.Posicao;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {
	
	private MesaTabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new MesaTabuleiro(8, 8);
		iniciarPartida();
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
	
	private void iniciarPartida() {
		tabuleiro.adicionarPeca(new Torre(tabuleiro, Color.BLACK), new Posicao(2, 4));
		tabuleiro.adicionarPeca(new Rei(tabuleiro, Color.WHITE), new Posicao(1, 4));
	}
}
