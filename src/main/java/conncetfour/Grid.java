package conncetfour;

import conncetfour.utils.DisplayGrid;

import java.util.Arrays;

// 7 colonne
// 6 linge
public class Grid {

    private char[][] matrix;

    public void setGrid(char[][] matrix) {
        this.matrix = matrix;
    }

    public Grid() {
        this.matrix = new char[6][7];
        for (char[] chars : matrix) {
            Arrays.fill(chars, '.');
        }

    }

    public int getNombreLigne() {
        return this.matrix.length;
    }

    public int getNombreColumn() {
        return this.matrix[0].length;
    }


    public char[][] getGrid() {
        return matrix;
    }


    public boolean insert(int columnIndex, char r) {

        for (int i = this.matrix.length - 1; i >= 0; i--) {
            if (this.matrix[i][columnIndex] == '.') {
                this.matrix[i][columnIndex] = r;
                return true;
            }
        }
        return false;
    }
}
