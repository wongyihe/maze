package maze;

import java.awt.Canvas;
import java.text.DecimalFormat;

public class maze_env extends Canvas {
	int[][] MAZE = { { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 2 },
			{ 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1 },
			{ 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1 },
			{ 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1 },
			{ 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1 },
			{ 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1 },
			{ 99, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, };

	public void showMaze() {
		for (int i = 0; i < MAZE.length; i++) {
			for (int j = 0; j < MAZE[0].length; j++) {

		if(MAZE[i][j]==0) {System.out.print("  ");}
		else if(MAZE[i][j]==1) {System.out.print("◾️");}
		else if(MAZE[i][j]==2) {System.out.print("️⭕️");}
		else if(MAZE[i][j]==99) {System.out.print("⛳️️");}
		else if(MAZE[i][j]<0) {System.out.print(" ·️️");}
		else {System.out.print("|"+new DecimalFormat("000").format(MAZE[i][j])+"|");}	
				
			}
			System.out.println();
		}
	}
}
