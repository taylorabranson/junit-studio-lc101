package test;

import main.BonusBinarySearch;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

public class BonusBinarySearchTest {

    int[] sortedNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    @Test
    public void searchForIntegerReturnsIndex() {
        assertEquals(4, BonusBinarySearch.binarySearch(sortedNumbers, 5), .001);
    }

    @Test
    public void searchForLowerBoundNumberReturnsIndex() {
        assertEquals(0, BonusBinarySearch.binarySearch(sortedNumbers, 1), .001);
    }

    @Test
    public void searchForUpperBoundNumberReturnsIndex() {
        assertEquals(8, BonusBinarySearch.binarySearch(sortedNumbers, 9), .001);
    }

    @Test
    public void searchForTooBigNumberReturnsNegativeOne() {
        assertEquals(-1, BonusBinarySearch.binarySearch(sortedNumbers, 11), .001);
    }

    @Test
    public void searchForTooSmallNumberReturnsNegativeOne() {
        assertEquals(-1, BonusBinarySearch.binarySearch(sortedNumbers, -4), .001);
    }
}