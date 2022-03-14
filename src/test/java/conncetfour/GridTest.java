package conncetfour;

import conncetfour.constant.Constant;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class GridTest {


    @DisplayName("should Return 6x7 Matrix On Init")
    @Test
    void shouldReturn6x7MatrixOnInit() {

        // given
        Grid grid = new Grid();
        // when
        int nombreLigne = grid.getNombreLigne();
        int nombreColumn = grid.getNombreColumn();
        //Then
        assertEquals(6, nombreLigne);
        assertEquals(7, nombreColumn);

    }

    @DisplayName("should Return Empty Matrix On Init")
    @Test
    void shouldReturnEmptyMatrixOnInit() {

        // given
        Grid grid = new Grid();
        // when
        char[][] resultGrid = grid.getGrid();
        //Then
        assertArrayEquals(Constant.EMPTY_GRID, resultGrid);

    }

    @DisplayName("should Return Valid Matrix After Adding Value In Column 1")
    @Test
    void shouldReturnValidMatrixAfterAddingRInColumn1() {

        // given
        Grid grid = new Grid();
        // when
        boolean insertResult = grid.insert(1, 'r');
        //Then
        assertTrue(insertResult);

    }

    @DisplayName("should Return Valid Matrix After Adding Value In Column 1")
    @Test
    void shouldReturnValidMatrixAfterAddingBInColumn1() {

        // given
        Grid grid = new Grid();
        grid.setGrid(Constant.GRID_Ok);
        // when
        boolean insertResult = grid.insert(0, 'b');
        //Then
        assertTrue(insertResult);
    }

}