package semestr1.practice6;

public class Matrix2D {
    private int[][] grid;

    public void setGrid(int[][] grid) {
        this.grid = grid;

    }

    public void printMatrix() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.println(grid[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public int getTotalSum() {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                sum = sum + grid[i][j];
            }
        }
        return sum;
    }
    public int getRowSum(int rowIndex) {
        int sum = 0;

        for (int j = 0; j < grid[rowIndex].length; j++) {
            sum = sum + grid[rowIndex][j];
        }

        return sum;
    }
}




