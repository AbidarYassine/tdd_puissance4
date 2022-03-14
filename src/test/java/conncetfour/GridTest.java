package conncetfour;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


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

}