package xadrez;

import tabuleiro.MesaTabuleiro;
import tabuleiro.Peca;

public class PecaXadrez extends Peca {
	
	private Color color;

	public PecaXadrez(MesaTabuleiro tabuleiro, Color color) {
		super(tabuleiro);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	
}
