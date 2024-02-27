package main;

import javax.swing.JFrame;

public class Main {

		public static void main(String[] args) {
			JFrame window = new JFrame();
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setResizable(false);
			window.setTitle("Tic-Tac-Toe");
			
			GamePanel gp = new GamePanel();
			window.add(gp);	//adding GamePanel to JFrame (connecting them)
			window.pack();
			
			window.setLocationRelativeTo(null); //where window appears on screen
			window.setVisible(true);
			
			gp.launchGame(); //starts thread
		}
}
