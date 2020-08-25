package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsAroundTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[text]"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void disorderedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void missingClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void missingOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void multipleOrderedBracketSetsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void nestedBracketSetsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[][]]"));
    }

    @Test
    public void misNestedBracketSetsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]][]["));
    }

    @Test
    public void testCasesThatReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void testCasesThatReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
}