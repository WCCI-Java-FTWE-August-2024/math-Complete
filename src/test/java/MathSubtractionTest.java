import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import wcci.org.MathProblems;

public class MathSubtractionTest {
    // Story 7: Subtracting Expenses from Budget
    @Test
    void Story7() {
        MathProblems problems = new MathProblems();
        double[] param = { 10, 15, 5 };
        double result = problems.Story7(50d, param);
        assertEquals(20, result);
    }

    // Story 8: Calculating Remaining Distance
    @Test
    void Story8() {
        MathProblems problems = new MathProblems();

        int result = problems.Story8(100, 40);
        assertEquals(60, result);
    }

    // Story 9: Determining Remaining Work Hours
    @Test
    void Story9() {
        MathProblems problems = new MathProblems();

        int result = problems.Story9(40, 32);
        assertEquals(8, result);
    }

    // Story 10: Subtracting Scores in a Game
    @Test
    void Story10() {
        MathProblems problems = new MathProblems();
        int[] param = { 50, 30,20 };
        int result = problems.Story10(500, param);
        assertEquals(400, result);
    }
    //Story 11: Calculating Remaining Savings After Purchases
    @Test
    void Story11() {
        MathProblems problems = new MathProblems();
        double[] param = { 50,30 };
        double result = problems.Story11(200d, param);
        assertEquals(120, result);
    }
    //Story 12: Subtracting Weights of Used Materials
    @Test
    void Story12() {
        MathProblems problems = new MathProblems();
        int[] param = { 30,20 };
        int result = problems.Story12(100, param);
        assertEquals(50, result);
    }
}
