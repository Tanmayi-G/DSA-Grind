package Recursion;

import java.util.ArrayList;

public class RatInAMaze {
    static String dir = "DLRU";
    static int[] dr = {1, 0, 0, -1};
    static int[] dc = {0, -1, 1, 0};

    static ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> result = new ArrayList<>();
        int n = maze.length;
        String path = "";

        if (maze[0][0] != 0 && maze[n - 1][n - 1] != 0) {
            findPath(0, 0, maze, path, result);
        }

        return result;
    }

    static void findPath(int r, int c, int[][] maze, String path, ArrayList<String> res) {
        int n = maze.length;

        if (r == n - 1 && c == n - 1) {
            res.add(path);
            return;
        }

        maze[r][c] = 0;

        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i], nc = c + dc[i];
            if (isValid(nr, nc, n, maze)) {
                findPath(nr, nc, maze, path + dir.charAt(i), res);
            }
        }

        maze[r][c] = 1;  
    }

    static boolean isValid(int r, int c, int n, int[][] maze) {
        return r >= 0 && c >= 0 && r < n && c < n && maze[r][c] == 1;
    }
}
