package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
	
	public static final int WIDTH = 360;
	public static final int HEIGHT = 360;
	public static final int tileSize = WIDTH/3;
			
	final int FPS = 60;		
	
	Thread gameThread;
	
	public GamePanel() {
		this.setPreferredSize(new Dimension(WIDTH,HEIGHT));	//dimensions of window
		this.setBackground(Color.white);
		this.setLayout(null);
		
	}

	public void launchGame() { //starts game by activating the Thread gameThread
		gameThread = new Thread(this);
		gameThread.start();
	}
	
	public void run() {	
		double drawInterval = 1000000000/FPS;
		double delta = 0;
		long lastTime = System.nanoTime();
		long currentTime;
		
		while(gameThread != null) {
			
			currentTime = System.nanoTime();

			delta += (currentTime - lastTime) / drawInterval;
			lastTime = currentTime;
			
			if(delta >= 1) {
				update();
				repaint(); 
				delta--;
			}
			
		}
		
	}
	
	public void update() {
		
	}
	
	public void repaint() {
		
	}
	
	public void paintTile(Graphics2D g) {
		
		
	}
	
	

}
