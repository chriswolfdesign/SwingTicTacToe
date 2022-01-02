package model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    @Test
    public void testGetPlayerXRepresentation() {
        assertEquals("X", Player.X.getRepresentation());
    }

    @Test
    public void testGetPlayerORepresentation() {
        assertEquals("O", Player.O.getRepresentation());
    }

    @Test
    public void testGetPlayerNoneRepresentation() {
        assertEquals(" ", Player.NONE.getRepresentation());
    }
}
