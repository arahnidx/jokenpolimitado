package br.com.poo;
import java.util.ArrayList;

public class Player {
	private static int totalEstrelas;
	private static int totalCartas;
	private static int totalPedra;
	private static int totalPapel;
	private static int totalTesoura;
	
	private String player;
	private int id = 100;
	private int estrelas;
	private int pedra;
	private int papel;
	private int tesoura;
	
	
	
	
	public Player(String player) {
		this.id++;
		this.player = player;
		this.pedra = 4;
		this.papel = 4;
		this.tesoura = 4;
		this.estrelas = 3;
		totalEstrelas+=3;
		totalCartas+=12;
		totalPedra+=4;
		totalPapel+=4;
		totalTesoura+=4;
				
		
	}


	public
	void setEscolha(String carta) {

		if(carta.equals("Pedra")) {
			this.pedra--;
		}
		else if(carta.equals("Papel")) {
			this.papel--;
		}
		else if(carta.equals("Teosura")) {
			this.tesoura--;
		}
	}
	
	public void setEstrelasDerrota() {
		this.estrelas--;
	}
	
	public void setEstrelasVitoria() {
		this.estrelas++;
	}
	
	public String getPlayerName() {
		return player;
	}
	public int getId() {
		return id;
	}


	public String getPlayer() {
		return player;
	}


	public void setPlayer(String player) {
		this.player = player;
	}


	public int getEstrelas() {
		return estrelas;
	}


	public void setEstrelas(int estrelas) {
		this.estrelas = estrelas;
	}


	public int getPedra() {
		return pedra;
	}


	public void setPedra(int pedra) {
		this.pedra = pedra;
	}


	public int getPapel() {
		return papel;
	}


	public void setPapel(int papel) {
		this.papel = papel;
	}


	public int getTesoura() {
		return tesoura;
	}


	public void setTesoura(int tesoura) {
		this.tesoura = tesoura;
	}


	public void setId(int id) {
		this.id = id;
	}


	public static int getTotalEstrelas() {
		return totalEstrelas;
	}


	public static void setTotalEstrelas(int totalEstrelas) {
		Player.totalEstrelas = totalEstrelas;
	}


	public static int getTotalCartas() {
		return totalCartas;
	}


	public static void setTotalCartas(int totalCartas) {
		Player.totalCartas = totalCartas;
	}


	public static int getTotalPedra() {
		return totalPedra;
	}


	public static void setTotalPedra(int totalPedra) {
		Player.totalPedra = totalPedra;
	}


	public static int getTotalPapel() {
		return totalPapel;
	}


	public static void setTotalPapel(int totalPapel) {
		Player.totalPapel = totalPapel;
	}


	public static int getTotalTesoura() {
		return totalTesoura;
	}


	public static void setTotalTesoura(int totalTesoura) {
		Player.totalTesoura = totalTesoura;
	}
	
	
	
	

}
