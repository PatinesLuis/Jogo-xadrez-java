package tabuleiro;

public class MesaTabuleiro {
	
	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	
	public MesaTabuleiro(int linhas, int colunas) {
		if(linhas < 1 || linhas < 1) {
			throw new ExcecoesTabuleiro("erro criando tabuleiro, necessário pelo menos 1 linha e 1 coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}


	public int getLinhas() {
		return linhas;
	}


	public int getColunas() {
		return colunas;
	}

	
	public Peca peca(int linha, int coluna) {
		if(!posicaoExistente(linha, coluna)) {
			throw new ExcecoesTabuleiro("Posicao não está no tabuleiro");
		}
		return pecas[linha][coluna];
	}
	
	public Peca peca(Posicao posicao) {
		if(!posicaoExistente(posicao)) {
			throw new ExcecoesTabuleiro("Posicao não está no tabuleiro");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void adicionarPeca(Peca peca, Posicao posicao) {
		if(existepeca(posicao)) {
			throw new ExcecoesTabuleiro("já existe uma peça em posição " + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
	
	private boolean posicaoExistente(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}
	
	public boolean posicaoExistente(Posicao posicao) {
		return posicaoExistente(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean existepeca(Posicao posicao) {
		if(!posicaoExistente(posicao)) {
			throw new ExcecoesTabuleiro("Posicao não está no tabuleiro");
		}
		return peca(posicao) != null;
	}
	
	
}
