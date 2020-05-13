package br.com.poo;


import javax.swing.JOptionPane;
import javax.swing.JFileChooser;

public class AppMain {

	public static void main(String[] args) {
		
		
		Sistema game = new Sistema();
		
		Player player1 = new Player("Sidney");
		Player player2 = new Player("Julia");

	
		

		
		while(player1.getEstrelas()>0 && player2.getEstrelas()>0) {
			String j1 = JOptionPane.showInputDialog("Faça a sua jogada "+player1.getPlayer());
			String j2 = JOptionPane.showInputDialog("Faça a sua jogada "+player2.getPlayer());
			
			game.disputa(j1,j2,player1,player2);
			
			System.out.println(player1.getPlayer()+" tem "+player1.getEstrelas() +" estrelas");
			
			System.out.println(player2.getPlayer()+" tem "+player2.getEstrelas() +" estrelas");
			
			
			
		}
		if(player1.getEstrelas()>player2.getEstrelas()) {
			System.out.println("Player 1 venceu");
		}
		else {
			System.out.println("Player 2 venceu");
		}
		
		if(Player.getTotalCartas()<1) {
			System.out.println("Fim de jogo, acabaram as cartas");
			
		}
		
		
	}

}
