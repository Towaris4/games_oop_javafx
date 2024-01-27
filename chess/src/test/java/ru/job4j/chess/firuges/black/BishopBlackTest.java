package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

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
    }

    @Test
    void isDiagonal() {
    }

    @Test
    void copy() {
    }
}