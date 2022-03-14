package conncetfour;

import conncetfour.constant.Constant;

import java.util.Arrays;

// 7 colonne
// 6 linge
public class Grid {

    private final char[][] matrix;

    public Grid() {
        this.matrix = new char[6][7];
        for (char[] chars : matrix) {
            Arrays.fill(chars, '-');
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

    public char[][] insert(int i, char r) {
        return Constant.GRID_Ok_AFTER_INSERTION_OF_R_IN_1;
    }
}
