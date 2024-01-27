package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static ru.job4j.chess.firuges.Cell.G5;

class BishopBlackTest {

    @Test
    void position() {
        Cell result = Cell.C8;
        Figure figure = new BishopBlack(result);
        Cell expected = figure.position();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void way() {
        Figure figure = new BishopBlack(Cell.C1);
        Cell[] result = figure.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, G5};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void isDiagonal() {
    }

    @Test
    void copy() {
        Cell result = Cell.C8;
        Figure figure = new BishopBlack(Cell.C8);
        figure = figure.copy(Cell.C1);
        Cell expected = figure.position();
        assertThat(Cell.C1).isEqualTo(expected);
    }

}