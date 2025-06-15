package tpdf2;

import java.util.Random;
import java.util.Scanner;

public class Question43View {

	Question43Model model;
	private Scanner sc = new Scanner(System.in);

	Question43View() {
		model = new Question43Model(this);
	}

	public void init() {

		System.out.println("No of players :");
		int players = sc.nextInt();
		model.startSetup(players);

	}

	public void startGame(int n) {

	

	
			for (int i = 0; i < n; i++) {

				System.out.println("dice rolling for player :" + (i + 1));

				Random random = new Random();
				int value = random.nextInt(6) + 1;
				if (model.validatePlayer(value, i)) {
					System.out.println("u got " + value);
					System.out.println();
					model.move(value, i);
				    
				} else if (value != 1) {
					System.out.println("Not Alive Still need one, but got " + value);
					
				}
			}
			
			model.printboard();
			System.out.println("Roll the dice Enter y-> yes or n->no  ");
			char opt = sc.next().charAt(0);
			if(opt=='y') {
				startGame(n);
			}
			else {
				System.out.println("Game Exit");
			}
		

	}
}
