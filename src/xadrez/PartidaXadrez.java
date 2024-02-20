package xadrez;

import tabuleiro.MesaTabuleiro;
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
	
	private void colocarNovaPeca(char coluna, int linha, PecaXadrez peca) {
		tabuleiro.adicionarPeca(peca, new PosicaoXadrez(coluna, linha).posicionar());
	}
	
	private void iniciarPartida() {
		colocarNovaPeca('b', 6,new Torre(tabuleiro, Color.BLACK));
		colocarNovaPeca('f', 3,new Rei(tabuleiro, Color.WHITE));
	}
}
