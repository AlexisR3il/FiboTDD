package collections;

import static org.junit.Assert.assertThrows;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

class FiboTest {

    @Test
    void testSix() {
        FiboIterator fiboIter = new FiboIterator(6);
        int[] expected = { 1, 1, 2, 3, 5, 8 };
        int index = 0;
        while (fiboIter.hasNext()) {
            assertEquals(expected[index++], fiboIter.next());
        }
    }

    @Test
    void testZero() {
        FiboIterator fiboIter = new FiboIterator(0);
        assertFalse(fiboIter.hasNext());
    }

    @Test
    void testNegatif() {
        FiboIterator fiboIter = new FiboIterator(-1);
        assertFalse(fiboIter.hasNext());
    }

}
