package org.howard.edu.lsp.midterm;


import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Assertions;

public class IntegerRangeTest {

    @Test
    public void testContains() {
        Range range = new IntegerRange(1, 5);
        assertTrue(range.contains(3));
        assertFalse(range.contains(0));
        assertFalse(range.contains(6));
    }

    @Test
    public void testOverlaps() throws EmptyRangeException {
        Range range1 = new IntegerRange(1, 5);
        Range range2 = new IntegerRange(3, 7);
        Range range3 = new IntegerRange(6, 9);
        assertTrue(range1.overlaps(range2));
        assertFalse(range1.overlaps(range3));
        assertFalse(range1.overlaps(null));
    }

    @Test
    public void testSize() {
        Range range = new IntegerRange(1, 5);
        assertEquals(range.size(), 5);
    }
    
    
    @Test
    public void testOverlapsThrowsExceptionForNullInput() {
        IntegerRange range = new IntegerRange(1, 5);
        Assertions.assertThrows(EmptyRangeException.class, () -> {
            range.overlaps(null);
        });
    }

    @Test
    public void testOverlapsDoesNotThrowExceptionForNonNullInput() {
        IntegerRange range1 = new IntegerRange(1, 5);
        IntegerRange range2 = new IntegerRange(3, 7);
        Assertions.assertDoesNotThrow(() -> {
            range1.overlaps(range2);
        });
    }
    
}


