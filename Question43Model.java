package tpdf2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

class player {
	int[] pos = { -1, -1 };
	boolean alive = false;
}

public class Question43Model {

	Question43View view;

	private char[][] board;
	private int players;
	Map<Character, int[]> endpts;

	Question43Model(Question43View view) {
		this.view = view;
	}

	public void startSetup(int players) {

		board = new char[10][10];
		this.players = players;
		creatPlayer();
		boardSetup();

	}

	private void boardSetup() {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				board[i][j] = '_';
			}
		}
		// snakes
		board[7][7] = '1';
		board[3][3] = '2';
		board[5][5] = '3';
		// ladder
		board[2][3] = 'a';
		board[3][4] = 'b';
		board[5][6] = 'c';
		board[6][7] = 'd';

		endpts = new HashMap<>();

		endpts.put('1', new int[] { 4, 4 });

		endpts.put('2', new int[] { 1, 1 });

		endpts.put('3', new int[] { 2, 2 });

		endpts.put('a', new int[] { 4, 8 });

		endpts.put('b', new int[] { 5, 4 });

		endpts.put('c', new int[] { 8, 9 });

		endpts.put('d', new int[] { 7, 3 });

		startGame();

	}

	private void startGame() {
		view.startGame(players);

	}

	private List<player> playerobj = new ArrayList<>();

	private void creatPlayer() {

		for (int i = 0; i < players; i++) {
			playerobj.add(new player());
		}
	}

	public boolean validatePlayer(int value, int i) {
		if (value == 1 && !playerobj.get(i).alive) {
			playerobj.get(i).pos[0] = 0;
			playerobj.get(i).pos[1] = 0;
			playerobj.get(i).alive = true;
			System.out.println("hooray you are Alive");
			return false;
		}
		if (playerobj.get(i).alive)
			return true;
		return false;
	}

	public void move(int value, int i) {
		int row = playerobj.get(i).pos[0];
		int col = playerobj.get(i).pos[1];
		board[row][col] = '_';

		int raw_y = playerobj.get(i).pos[1] + value;

		if (raw_y > 9) { // 8,7 +4 12,11 -> 9,2
			if ((playerobj.get(i).pos[0] + 1) <= 9) {
				playerobj.get(i).pos[0] += 1;
				playerobj.get(i).pos[1] = (raw_y % 9);
			}
		} else {

			playerobj.get(i).pos[1] += value;
		}

		checkSnakeOrLadder(i);

	}

	private void checkSnakeOrLadder(int i) {

		int row = playerobj.get(i).pos[0];
		int col = playerobj.get(i).pos[1];

		char a = board[row][col];
		if (endpts.containsKey(a)) {
			int[] pos = endpts.get(a);
			playerobj.get(i).pos[0] = pos[0];
			playerobj.get(i).pos[0] = pos[1];
		}
		board[row][col] = (char) ('A' + i);
		checkifWinner(i);

	}

	private void checkifWinner(int i) {
		// TODO Auto-generated method stub
		int row = playerobj.get(i).pos[0];
		int col = playerobj.get(i).pos[1];

		if (row == 9 && col == 9) {
			System.out.println("Winner is player " + i);
			printboard();
			System.exit(0);
		}

	}

	public void printboard() {
		// TODO Auto-generated method stub
		for (char[] row : board) {
			System.out.println(Arrays.toString(row));
		}

	}

}
