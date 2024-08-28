import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import wcci.org.MathProblems;

public class MathCompoundTest {
    // Story 38: Randomly Generating Lottery Numbers
    @Test
    void Story38() {
        MathProblems problems = new MathProblems();
        int[] result = problems.Story38(5);
        assertEquals(5, result.length);
    }

    // Story 39: Calculating Total Cost with Tax
    @Test
    void Story39() {
        MathProblems problems = new MathProblems();
        double result = problems.Story39(50d, 8d);
        assertEquals(54, result);
    }

    // Story 40: Calculating Average Speed
    @Test
    void Story40() {
        MathProblems problems = new MathProblems();
        long result = problems.Story40(150, 3, 30);
        assertEquals(43, result);
    }

    // Story 41: Determining Total Savings After Annual Deposits
    @Test
    void Story41() {
        MathProblems problems = new MathProblems();
        double result = problems.Story41(200d, 5, 8);
        assertEquals(1680, result);
    }

    // Story 42: Finding the Sum and Average of Three Numbers
    @Test
    void Story42() {
        MathProblems problems = new MathProblems();
        int[] result = problems.Story42(85, 90, 78);
        assertEquals(253, result[0]);
        assertEquals(84, result[1]);
    }
    //Story 43: Converting Temperature from Celsius to Fahrenheit
    @Test
    void Story43() {
        MathProblems problems = new MathProblems();
        double result = problems.Story43(25);
        assertEquals(77, result);
    }
}
