package maze;

public class run_this {

	public static void main(String[] args) {
		maze_env maze = new maze_env();
		maze.showMaze();
		agent a = new agent();
		a.move(2, 16, maze.MAZE);
		a.getRoute(maze.MAZE);
		System.out.println("----------------------------------");
		maze.showMaze();
	}

}
