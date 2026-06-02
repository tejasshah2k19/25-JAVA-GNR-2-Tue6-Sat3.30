package thread;

import java.util.ArrayList;

public class GuessGame {

	public static void main(String[] args) {

		PlayerG p1 = new PlayerG("player1");
		PlayerG p2 = new PlayerG("player2");
		PlayerG p3 = new PlayerG("player3");

		p1.start();
		p2.start();
		p3.start();

		//
		
		try {
			Thread.sleep(500*5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("THE END");
		
		System.out.println(p1.points);
		System.out.println(p2.points);
		System.out.println(p3.points);

		System.out.println(MainBoard.points);
	
	
	
	}

}

class MainBoard extends Thread {
	static int points = 5000;
	static int round = 1;
	static ArrayList<Integer> winningNumbers = new ArrayList<Integer>();

	static {
		winningNumbers.add(5);
		winningNumbers.add(3);
		winningNumbers.add(4);
		winningNumbers.add(1);
		winningNumbers.add(2);
	}
}

class PlayerG extends MainBoard {
	String name;
	int points = 2000;
	int guessNum;

	public PlayerG(String name) {
		this.name = name;
	}

	public void run() {
		gamePlay();
	}

	void gamePlay() {
		for (int i = 1; i <= 5; i++) {

			guessNum = (int) (Math.random() * 10);// 4
			System.out.println("Round => " + i + " " + name + " guess num => " + guessNum+" winning num => "+winningNumbers.get(i-1));// r 1 p1 4

			if(winningNumbers.get(i-1) == guessNum) {
				System.out.println("Round => "+i+" won by "+name);
				points = points + 1000;
				MainBoard.points = MainBoard.points - 1000;
			}else {
				points = points-500;
				MainBoard.points = MainBoard.points + 500;
			}
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
