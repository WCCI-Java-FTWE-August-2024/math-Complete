import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import wcci.org.MathProblems;

public class MathModuloTest {
    // Story 25: Determining Remaining Amount After Full Payments
    @Test
    void Story25() {
        MathProblems problems = new MathProblems();
        double result = problems.Story25(100d, 7d);
        assertEquals(2, result);
    }

    // Story 26: Calculating Remainder of Distance
    @Test
    void Story26() {
        MathProblems problems = new MathProblems();
        int result = problems.Story26(123, 50);
        assertEquals(23, result);
    }

    // Story 27: Determining Extra Hours After Full Weeks
    @Test
    void Story27() {
        MathProblems problems = new MathProblems();
        int result = problems.Story27(85, 40);
        assertEquals(5, result);
    }
   //Story 28: Calculating Points Left After Levels
   @Test
   void Story28() {
       MathProblems problems = new MathProblems();
       int result = problems.Story28(730, 100);
       assertEquals(30, result);
   } 
   //Story 29: Finding Remaining Savings After Annual Payments
   @Test
    void Story29() {
        MathProblems problems = new MathProblems();
        double result = problems.Story29(250d, 45d);
        assertEquals(25, result);
    } 
    //Story 30: Determining Leftover Materials After Packing
    @Test
    void Story30() {
        MathProblems problems = new MathProblems();
        int result = problems.Story30(92, 15);
        assertEquals(2, result);
    } 
}
