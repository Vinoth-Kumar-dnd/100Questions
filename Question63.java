package tpdf2;

public class Question63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] b = { { 'e', 'r', 'o', 't' }, { 'o', 'a', 'm', 't' }, { 'e', 'r', 'a', 't' }, { 'e', 'r', 'o', 't' } };
		boolean[][] visited = new boolean[b.length][b[0].length];
		String tar = "mat";

		if (exists(b, tar)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

	public static boolean exists(char[][] b, String tar) {
		int n = b.length;
		int m = b[0].length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (b[i][j] == tar.charAt(0)) {
					boolean[][] visited = new boolean[n][m];
					visited[i][j] = true;
					if (findWord(b, tar, 1, i, j, visited)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	private static boolean findWord(char[][] b, String tar, int idx, int i, int j, boolean[][] visited) {

		if (tar.length() == idx) {
			return true;
		}

		int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

		for (int[] d : directions) {
			int a = i + d[0];
			int b1 = j + d[1];
			if (a >= 0 && a < b.length && b1 >= 0 && b1 < b[0].length) {

				if (b[a][b1] == tar.charAt(idx) && !visited[a][b1]) {
					visited[a][b1] = true;
					if (findWord(b, tar, idx + 1, a, b1, visited)) {
						return true;
					}
					visited[a][b1] = false;

				}

			}

		}
		return false;
	}

}
