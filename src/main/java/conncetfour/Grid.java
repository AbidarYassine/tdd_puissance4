package conncetfour;

// 7 colonne
// 6 linge
public class Grid {

    private final char[][] matrix;

    public Grid() {
        this.matrix = new char[6][7];
    }

    public int getNombreLigne() {
        return this.matrix.length;
    }
    public int getNombreColumn() {
        return this.matrix[0].length;
    }


}
