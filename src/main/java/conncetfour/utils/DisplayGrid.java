package conncetfour.utils;

public class DisplayGrid {

    private DisplayGrid() {
    }

    public static void displayGrid(char[][] grid) {
        for (int i = 0; i < grid.length * 4 - 1; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < grid.length; i++) {
            System.out.print("|");
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(" " + grid[i][j] + " ");
            }
            System.out.print("|");
            System.out.println("");
        }
        for (int i = 0; i < grid.length * 4 - 1; i++) {
            System.out.print("-");
        }
    }
}
