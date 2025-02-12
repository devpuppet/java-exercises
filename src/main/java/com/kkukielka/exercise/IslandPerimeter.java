package com.kkukielka.exercise;

import java.util.HashSet;
import java.util.Set;

public class IslandPerimeter {

    Set<String> visited = new HashSet<>();

    public int islandPerimeter(int[][] grid) {
        int[][] islandStart = findIsland(grid);

        return calculatePerimeter(grid, islandStart[0][0], islandStart[1][0]);
    }

    private int calculatePerimeter(int[][] grid, int row, int col) {
        if (isVisited(row, col)) {
            return 0;
        }

        if (row < 0 || col < 0 || row > grid.length - 1 || col > grid[row].length - 1) {
            return 1;
        }

        if (grid[row][col] == 0) {
            return 1;
        }

        if (grid[row][col] == 1) {
            setAsVisited(row, col);
        }

        int leftPer = calculatePerimeter(grid, row, col - 1);
        int topPer = calculatePerimeter(grid, row - 1, col);
        int rightPer = calculatePerimeter(grid, row, col + 1);
        int bottomPer = calculatePerimeter(grid, row + 1, col);

        return leftPer + rightPer + topPer + bottomPer;
    }

    private void setAsVisited(int row, int col) {
        visited.add(String.format("%s-%s", row, col));
    }

    private boolean isVisited(int row, int col) {
        return visited.contains(String.format("%s-%s", row, col));
    }


    private int[][] findIsland(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    return new int[][] {new int[] {i}, new int[] {j}};
                }
            }
        }

        throw new IllegalArgumentException("There is no island in the grid!");
    }

    public int[][] buildTestGrid() {
        return new int[][] {
                new int[] {0,1,0,0},
                new int[] {1,1,1,0},
                new int[] {0,1,0,0},
                new int[] {1,1,0,0}
        };
    }

    public int[][] buildTestGrid2() {
        return new int[][] {
                new int[] {0, 1}
        };
    }

    public int[][] buildTestGrid3() {
        return new int[][] {
                new int[] {0},
                new int[] {1}
        };
    }
}
