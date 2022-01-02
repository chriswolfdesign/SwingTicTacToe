package model;

import org.junit.Test;
import settings.BoardSettings;

import static org.junit.Assert.assertEquals;

public class BoardTest {
    @Test
    public void testInitialBoardAllTilesShouldBeNone() {
        Board board = new Board();

        for (int i = 0; i < BoardSettings.BOARD_SIZE; i++) {
            for (int j = 0; j < BoardSettings.BOARD_SIZE; j++) {
                assertEquals(Player.NONE, board.getPlayerAt(i, j));
            }
        }
    }

    @Test
    public void testSetPlayerXOnBoard() {
        Board board = new Board();
        assertEquals(Player.NONE, board.getPlayerAt(0, 0));
        board.setPlayerAt(0, 0, Player.X);
        assertEquals(Player.X, board.getPlayerAt(0, 0));
    }

    @Test
    public void testSetPlayerOOnBoard() {
        Board board = new Board();
        assertEquals(Player.NONE, board.getPlayerAt(1, 1));
        board.setPlayerAt(1, 1, Player.O);
        assertEquals(Player.O, board.getPlayerAt(1, 1));
    }
}
