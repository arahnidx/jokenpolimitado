package br.com.poo;

import java.util.ArrayList;

import br.com.poo.Player;


public class Sistema {

	private int instancias;
	ArrayList<Player> jogadores = new ArrayList<Player>();	

	public Sistema() {
		this.instancias = 0;
	}
	
	public void adPlayer(Player jogador) {
		jogadores.add(jogador);
	}
	public ArrayList<Player> getPlayers() {
		return jogadores;
	}
	
	

	public void disputa(String cartaA, String cartaB, Player x, Player y) {

		if (((x.getPedra() < 1) && (cartaA.equals("Pedra")) || (y.getPedra() < 1) && (cartaB.equals("Pedra")))
				|| ((x.getPapel() < 1) && (cartaA.equals("Papel")) || (y.getPapel() < 1) && (cartaB.equals("Papel")))
				|| ((x.getTesoura() < 1) && (cartaA.equals("Tesoura"))
						|| (y.getTesoura() < 1) && (cartaB.equals("Tesoura")))

		) {
			System.out.println("Cartas escolhidas não disponíveis no inventário");
		} else {
			if (cartaA.equals("Pedra") && cartaB.equals("Papel")) {
				x.setEscolha(cartaA);
				y.setEscolha(cartaB);
				y.setEstrelasVitoria();
				x.setEstrelasDerrota();
				System.out.println(y.getPlayerName() + " venceu a rodada!");
			} else if (cartaA.equals("Pedra") && cartaB.equals("Tesoura")) {
				x.setEscolha(cartaA);
				y.setEscolha(cartaB);
				x.setEstrelasVitoria();
				y.setEstrelasDerrota();
				System.out.println(x.getPlayerName() + " venceu a rodada!");
			} else if (cartaA.equals("Pedra") && cartaB.equals("Pedra")) {
				x.setEscolha(cartaA);
				y.setEscolha(cartaB);
				System.out.println("Empate");
			} else if (cartaA.equals("Papel") && cartaB.equals("Pedra")) {
				x.setEscolha(cartaA);
				y.setEscolha(cartaB);
				x.setEstrelasVitoria();
				y.setEstrelasDerrota();
				System.out.println(x.getPlayerName() + " venceu a rodada!");
			} else if (cartaA.equals("Papel") && cartaB.equals("Papel")) {
				x.setEscolha(cartaA);
				y.setEscolha(cartaB);
				System.out.println("Empate");
			} else if (cartaA.equals("Papel") && cartaB.equals("Tesoura")) {
				x.setEscolha(cartaA);
				y.setEscolha(cartaB);
				y.setEstrelasVitoria();
				x.setEstrelasDerrota();
				System.out.println(y.getPlayerName() + " venceu a rodada!");
			} else if (cartaA.equals("Tesoura") && cartaB.equals("Pedra")) {
				x.setEscolha(cartaA);
				y.setEscolha(cartaB);
				y.setEstrelasVitoria();
				x.setEstrelasDerrota();
				System.out.println(y.getPlayerName() + " venceu a rodada!");
			} else if (cartaA.equals("Tesoura") && cartaB.equals("Tesoura")) {
				x.setEscolha(cartaA);
				y.setEscolha(cartaB);
				System.out.println("Empate");

			} else if (cartaA.equals("Tesoura") && cartaB.equals("Papel")) {
				x.setEscolha(cartaA);
				y.setEscolha(cartaB);
				x.setEstrelasVitoria();
				y.setEstrelasDerrota();
				System.out.println(x.getPlayerName() + " venceu a rodada!");
			}
		}

	}

}
