package jogoDaVelha;

import java.util.Scanner;
public class JogoDaVelha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual o nome do jogador 1?");
		String nomeJogadorUm = sc.nextLine();

		Jogador jogadorUm = new Jogador(nomeJogadorUm, "X");
		System.out.print("Qual o nome do jogador 2?");
		String nomeJogadorDois = sc.nextLine();
		Jogador jogadorDois = new Jogador(nomeJogadorDois, "O");
        Tabuleiro t = new Tabuleiro();
int numJogadas=1;
while(numJogadas <9 && !t.temVencedor () ) {
	numJogadas++;
	t.mostrarTabuleiro();
	Jogador daVez = numJogadas %2 ==0 ? jogadorDois : jogadorUm;
	Jogada nova = coletaJogada();
	t.executaJogada(nova);
}
if(numJogadas>=9 && !t.temVencedor()) {
	System.out.println("Deu velha!");
}else {
	System.out.println(t.imprimeVencedor());
}
	}

	private static Jogada coletaJogada() {
		// TODO Auto-generated method stub
		return null;
	}

}
