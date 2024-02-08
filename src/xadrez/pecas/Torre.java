package xadrez.pecas;

import tabuleiro.MesaTabuleiro;
import xadrez.Color;
import xadrez.PecaXadrez;

public class Torre extends PecaXadrez{

	public Torre(MesaTabuleiro tabuleiro, Color color) {
		super(tabuleiro, color);		
	}
	
	@Override
	public String toString() {
		return "T";
	}
}
