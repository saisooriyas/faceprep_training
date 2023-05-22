package practice;

public class maze {
    private final int N = 4;

    public void printSolution(int[][] sol) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(" " + sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isSafe(int[][] maze, int x, int y) {
        return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1);
    }

    public void solveMaze(int[][] maze) {
        int[][] sol = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sol[i][j] = 0;
            }
        }

        if (!solveMazeUtil(maze, 0, 0, sol)) {
            System.out.println("No solution");
            return;
        }
        System.out.println("Possible");

        printSolution(sol);
    }

    public boolean solveMazeUtil(int[][] maze, int x, int y, int[][] sol) {
        if (x == N - 1 && y == N - 1) {
            sol[x][y] = 1;
            return true;
        }

        if (isSafe(maze, x, y)) {
            sol[x][y] = 1;

            if (solveMazeUtil(maze, x + 1, y, sol)) {
                return true;
            }

            if (solveMazeUtil(maze, x, y + 1, sol)) {
                return true;
            }

            sol[x][y] = 0;
            return false;
        }

        return false;
    }

    public static void main(String[] args) {
        maze rat = new maze();
        int[][] maze = { { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 0, 1, 0 },
                { 1, 0, 1, 1 } };
        rat.solveMaze(maze);
    }
}