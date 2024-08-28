import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import wcci.org.MathProblems;

public class MathDivisionTest {

    //Story 19: Dividing Total Cost Among Friends
    @Test
    void Story19() {
        MathProblems problems = new MathProblems();
        double result = problems.Story19(80d, 4);
        assertEquals(20, result);
    }
    //Story 20: Calculating Average Distance Per Day
    @Test
    void Story20() {
        MathProblems problems = new MathProblems();
        int result = problems.Story20(35, 7);
        assertEquals(5, result);
    }
//Story 21: Determining Hourly Wage
@Test
    void Story21() {
        MathProblems problems = new MathProblems();
        double result = problems.Story21(300d, 20);
        assertEquals(15, result);
    }
    //Story 22: Calculating Points Per Level
    @Test
    void Story22() {
        MathProblems problems = new MathProblems();
        int result = problems.Story22(500, 10);
        assertEquals(50, result);
    }
    //Story 23: Calculating Interest Per Year
    @Test
    void Story23() {
        MathProblems problems = new MathProblems();
        double result = problems.Story23(50d, 5);
        assertEquals(10, result);
    }
    //Story 24: Determining Weight Per Package
    @Test
    void Story24() {
        MathProblems problems = new MathProblems();
        int result = problems.Story24(50, 10);
        assertEquals(5, result);
    }

}
