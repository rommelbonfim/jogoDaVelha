package jogoDaVelha;

public class Tabuleiro {
	private String[][] tabuleiroMatriz= {{"0","0","0"},{"0","0","0"},{"0","0","0"}};
	public boolean temVencedor() {
		// TODO Auto-generated method stub
		return false;
	}

	public void mostrarTabuleiro() {
		for(int linha = 0; linha <3; linha++) {
			for(int coluna= 0; coluna <3; coluna++) {
				System.out.printf(tabuleiroMatriz[linha][coluna]);
			}
		}

	}

	public void executaJogada(Jogada nova) {
		if(Jogador.daVez = jogadorUm)
	}

	
	public String imprimeVencedor() {
		// TODO Auto-generated method stub
		return null;
	}

}
