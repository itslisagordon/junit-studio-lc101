package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

        @Before

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void canContainString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Test string]"));
    }

    @Test
    public void mustBeEven() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Test string"));
    }

    @Test
    public void emptyString() {
            assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void openBracketNoClose() {
            assertFalse(BalancedBrackets.hasBalancedBrackets("[hello"));
    }

    @Test
    public void closeBracketOpenBracket() {
            assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void nestedBrackets() {
            assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void deepNestedBrackets() {
            assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[]][][][][[]]]]"));
    }

    @Test
    public void noBrackets() {
            assertTrue(BalancedBrackets.hasBalancedBrackets("hello"));
    }

    //should do one for nothing





}
