package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;
import static ru.job4j.chess.firuges.Cell.C8;
//import static sun.jvm.hotspot.runtime.VMOps.Exit;

public class BishopBlackTest {

     @Test
      public void whenPositionSame() {
          BishopBlack  bishopBlack = new BishopBlack(Cell.B1);
          bishopBlack.position();
          assertThat(bishopBlack.position(), is(Cell.B1));
      }
    @Test
    public void whenCopyCorrect() {
        BishopBlack  bishopBlack = new BishopBlack(C8);
        bishopBlack.copy(Cell.C8);
        assertThat(bishopBlack.position().equals(C8), is(true));
    }

}