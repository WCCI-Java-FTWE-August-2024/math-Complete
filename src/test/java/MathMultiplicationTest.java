import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import wcci.org.MathProblems;

public class MathMultiplicationTest {
    // Story 13: Calculating Total Cost of Multiple Items
    @Test
    void Story13() {
        MathProblems problems = new MathProblems();
        double result = problems.Story13(5d, 3);
        assertEquals(15, result);
    }

    // Story 14: Calculating Total Distance for Multiple Trips
    @Test
    void Story14() {
        MathProblems problems = new MathProblems();
        int result = problems.Story14(5, 10);
        assertEquals(50, result);
    }

    // Story 15: Determining Weekly Earnings
    @Test
    void Story15() {
        MathProblems problems = new MathProblems();
        double result = problems.Story15(15d, 20);
        assertEquals(300, result);
    }

    // Story 16: Calculating Points Earned in Multiple Games
    @Test
    void Story16() {
        MathProblems problems = new MathProblems();
        int result = problems.Story16(50, 10);
        assertEquals(500, result);
    }

    // Story 17: Calculating Total Savings with Interest
    @Test
    void Story17() {
        MathProblems problems = new MathProblems();
        double result = problems.Story17(200d, 5);
        assertEquals(210, result);
    }
    //Story 18: Calculating Total Weight of Multiple Packages
    @Test
    void Story18() {
        MathProblems problems = new MathProblems();
        int result = problems.Story18(5, 10);
        assertEquals(50, result);
    }
}
