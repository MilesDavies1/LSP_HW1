package org.howard.edu.assignment5;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

import javax.print.PrintException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {
    private IntegerSet2 set1;
    private IntegerSet2 set2;

    @BeforeEach
    public void setUp() throws IntegerSetException{
        set1 = new IntegerSet2();
        set2 = new IntegerSet2();
    }

    @Test
    @DisplayName("Test case for clear")
    public void testClear() throws IntegerSetException{
        set1.add(1);
        set1.add(2);
        set1.clear();
        assertTrue(set1.isEmpty());
        //throw new IntegerSetException("not cleared");
    }

    @Test
    @DisplayName("Test case for length")
    public void testLength() throws IntegerSetException{
        set1.add(1);
        set1.add(2);
        assertEquals(2, set1.length());
        //throw new IntegerSetException("not correct length");
    }

    @Test
    @DisplayName("Test case for equals")
    public void testEquals() throws IntegerSetException, PrintException{
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(1);
        assertTrue(set1.equals(set2));
        assertFalse(set1.equals(new IntegerSet2()));
        //throw new IntegerSetException("not equal");
    }

    @Test
    @DisplayName("Test case for contains")
    public void testContains() throws IntegerSetException{
        set1.add(1);
        assertTrue(set1.contains(1));
        assertFalse(set1.contains(2));
        //throw new IntegerSetException("not contained");
    }

    @Test
    @DisplayName("Test case for largest")
    public void testLargest() throws PrintException {
        set1.add(1);
        set1.add(3);
        set1.add(2);
        assertEquals(3, set1.largest());
        //assertThrows(IntegerSetException.class, () -> new IntegerSet2().largest());
    }

    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() throws PrintException {
        set1.add(1);
        set1.add(3);
        set1.add(2);
        assertEquals(1, set1.smallest());
        //assertThrows(IntegerSetException.class, () -> new IntegerSet2().smallest());
    }

    @Test
    @DisplayName("Test case for add")
    public void testAdd() throws IntegerSetException{
        set1.add(1);
        set1.add(2);
        set1.add(1);
        assertEquals(2, set1.length());
        //throw new IntegerSetException("not added correctly");
    }

    @Test
    @DisplayName("Test case for remove")
    public void testRemove() throws IntegerSetException{
        set1.add(1);
        set1.add(2);
        set1.remove(2);
        assertEquals(1, set1.length());
        assertFalse(set1.contains(2));
        //throw new IntegerSetException("not removed");
    }

    @Test
    @DisplayName("Test case for union")
    public void testUnion() throws IntegerSetException, PrintException{
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.union(set2);
        assertTrue(set1.contains(1));
        assertTrue(set1.contains(2));
        assertTrue(set1.contains(3));
        assertEquals(3, set1.length());
        //throw new IntegerSetException("not unioned");
    }

    @Test
    @DisplayName("Test case for intersection")
    public void testIntersect() throws IntegerSetException, PrintException{
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.intersect(set2);
        assertTrue(set1.contains(2));
        assertEquals(1, set1.length());
        //throw new IntegerSetException("not intersected");
    }

	@Test
    @DisplayName("Test case for diff")
	public void testDiff() throws IntegerSetException{
	    IntegerSet2 set1 = new IntegerSet2();
	    IntegerSet2 set2 = new IntegerSet2();
	    set1.add(1);
	    set1.add(2);
	    set2.add(2);
	    set1.diff(set2);
	    assertTrue(set1.contains(1));
	    assertFalse(set1.contains(2));
        //throw new IntegerSetException("not diffed correctly");
	  }
}
