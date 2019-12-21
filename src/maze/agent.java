package maze;

import java.text.DecimalFormat;

public class agent {
	
	boolean isfound=false;
	int current_state = 0;
	int back_current_state;
	int R[][] = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, };
	
	int Answer[][] = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, };

	public void move(int i, int j, int MAZE[][]) {

		R[i][j] = current_state + 1;
		current_state = R[i][j];
		if (i - 1 >= 0) {
			int up_state = MAZE[i - 1][j];
			ismoveable(i - 1, j, up_state, MAZE, "go up");
		}
		if (j - 1 >= 0) {
			int left_state = MAZE[i][j - 1];
			ismoveable(i, j - 1, left_state, MAZE, "go left");
		}
		if (i + 1 < MAZE.length) {
			int down_state = MAZE[i + 1][j];
			ismoveable(i + 1, j, down_state, MAZE, "go down");
		}
		if (j + 1 < MAZE[0].length) {
			int right_state = MAZE[i][j + 1];
			ismoveable(i, j + 1, right_state, MAZE, "go right");
		}

	}

	private void ismoveable(int i, int j, int next_state, int MAZE[][], String s) {

		if (next_state == 0 && R[i][j] == 0) {
			move(i, j, MAZE);
		} else if (next_state == 99) {
			move(i, j, MAZE);

			GoBack(i, j, R[i][j]);
		} else {
		}
	}

	public void GoBack(int i, int j, int current_state) {
		Answer[i][j] = -100;
		if (i - 1 >= 0&&isfound==false) {
			IsAGoodWay(i - 1, j, current_state, "go up");
		}
		if (j - 1 >= 0&&isfound==false) {
			IsAGoodWay(i, j - 1, current_state, "go left");
		}
		if (i + 1 < R.length&&isfound==false) {
			IsAGoodWay(i + 1, j, current_state, "go down");
		}
		if (j + 1 < R[0].length&&isfound==false) {
			IsAGoodWay(i, j + 1, current_state, "go right");
		}
	}

	private void IsAGoodWay(int i, int j, int current_state, String s) {

		if (R[i][j] < current_state && R[i][j] != 0) {
			GoBack(i, j, R[i][j]);

		} else if (current_state == 1) {
			isfound=true;
		} else {
		}

	}

	public void showRoute() {
		for (int i = 0; i < R.length; i++) {
			for (int j = 0; j < R[0].length; j++)
				System.out.print("|" + new DecimalFormat("000").format(R[i][j]) + "|");
			System.out.println();
		}
	}

	public void getRoute(int MAZE[][]) {
		for (int i = 0; i < R.length; i++) {
			for (int j = 0; j < R[0].length; j++)
				MAZE[i][j] += Answer[i][j];
			
		}
	}
}
