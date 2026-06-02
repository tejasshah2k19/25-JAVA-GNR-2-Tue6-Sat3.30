package thread;

import java.util.ArrayList;
import java.util.Scanner;

public class PointGame {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		Game game = new Game();// collection = 50000
								// point = 0

		System.out.println("How many players will play? ");
		int totalPlayer = scr.nextInt();

		ArrayList<Player> players = new ArrayList<Player>();
		for (int i = 1; i <= totalPlayer; i++) {
			Player p = new Player("Player" + i);
			players.add(p);
		}
		
		for(Player p:players) {
			p.start();
		}

	}
}

class Game extends Thread {
	static int collection = 50000;

}

class Player extends Game {
	String name;
	int points;

	public Player(String name) {
		this.name = name;
	}

	public void run() {
		while (collection != 0) {
			getPoints();
		}
		System.out.println("score of " + name + " : " + points);
	}

	synchronized void getPoints() {
//		try {
//			sleep(100);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		points = points + 500;
		collection = collection - 500;
		System.out.println(name + " is collecting point");
	}

}
