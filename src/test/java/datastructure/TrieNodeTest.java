package datastructure;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sanitizer on 12/23/2017.
 */
public class TrieNodeTest {

    @Test
    public void add() throws Exception {
        TrieNode test = new TrieNode();
        test.add("test");
        assertTrue(test.isCompleteWord("test"));
    }

    @Test
    public void isCompleteWord() throws Exception {
        TrieNode test = new TrieNode();
        test.add("test");
        test.add("hello world");
        assertTrue(test.isCompleteWord("test"));
        assertFalse(test.isCompleteWord("hello"));
        assertTrue(test.isCompleteWord("hello world"));
    }

    @Test
    public void numOfChildren() throws Exception {
        TrieNode test = new TrieNode();
        test.add("test");
        assertEquals(3, test.numOfChildren("t"));
        assertEquals(2, test.numOfChildren("te"));
        assertEquals(1, test.numOfChildren("tes"));
        // following 2 tests are making sure we have an initial word
        assertEquals(1, test.numOfChildren(""));
        assertEquals(1, test.numOfChildren(null));

        test.add("second");
        // following 2 tests are making sure we have an initial word
        assertEquals(2, test.numOfChildren(""));
        assertEquals(2, test.numOfChildren(null));

        test.add("hello world");
        // following 2 tests are making sure we have an initial word
        assertEquals(3, test.numOfChildren(""));
        assertEquals(3, test.numOfChildren(null));

        assertEquals(0, test.numOfChildren("test"));
        assertEquals(0, test.numOfChildren("x"));
    }

}