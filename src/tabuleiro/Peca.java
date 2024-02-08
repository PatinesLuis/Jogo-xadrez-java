package tabuleiro;


public class Peca {
	protected Posicao posicao;
	private MesaTabuleiro tabuleiro;
	
	
	public Peca(MesaTabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posicao = null;
	}


	protected MesaTabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
	
}
