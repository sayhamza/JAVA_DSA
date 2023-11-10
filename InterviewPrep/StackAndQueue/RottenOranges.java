// https://practice.geeksforgeeks.org/problems/rotten-oranges2536/1


package InterviewPrep.StackAndQueue;

import java.util.*;

public class RottenOranges {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0, minutes = 0;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }

        while (!queue.isEmpty() && freshCount > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] point = queue.poll();
                for (int[] direction : directions) {
                    int x = point[0] + direction[0];
                    int y = point[1] + direction[1];
                    if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == 0 || grid[x][y] == 2) {
                        continue;
                    }
                    queue.add(new int[]{x, y});
                    grid[x][y] = 2;
                    freshCount--;
                }
            }
            minutes++;
        }

        return freshCount == 0 ? minutes : -1;
    }

    public static void main(String[] args) {
        RottenOranges ro = new RottenOranges();
        int[][] grid = {{0,1,2},{0,1,2},{2,1,1}};
        int result = ro.orangesRotting(grid);
        System.out.println("Minimum time to rot all oranges: " + result);
    }
}
