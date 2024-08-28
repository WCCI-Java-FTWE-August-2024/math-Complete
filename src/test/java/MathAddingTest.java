import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import wcci.org.MathProblems;

public class MathAddingTest {

    @Test
    public  void calculateCompoundInterest() 
    {
        double e= (200d + (200d * Math.pow(1 + (.08d / 1), 1))) *5;
        System.out.println(e);
    }

    //Story 1: Adding Prices of Grocery Items
    @Test
    void Story1() {
        MathProblems problems = new MathProblems();
        double[] param = { 3, 2, 4 };
        double result = problems.Story1(param);
        assertEquals(9, result);
    }
    //Story 2: Calculating Total Distance Traveled
    @Test
    void Story2() {
        MathProblems problems = new MathProblems();
        int[] param = { 5, 3, 4};
        int result = problems.Story2(param);
        assertEquals(12, result);
    }
    //Story 3: Summing Up Hours Worked in a Week
    @Test
    void Story3() {
        MathProblems problems = new MathProblems();
        int[] param = { 4, 6, 5, 7, 3};
        int result = problems.Story3(param);
        assertEquals(25, result);
    }
     //Story 4: Adding Scores in a Game
     @Test
     void Story4() {
         MathProblems problems = new MathProblems();
         int[] param = { 150,200,180};
         int result = problems.Story4(param);
         assertEquals(530, result);
     }
     //Story 5: Calculating Total Savings
     @Test
     void Story5() {
         MathProblems problems = new MathProblems();
         float[] param = { 20,30,25};
         float result = problems.Story5(param);
         assertEquals(75, result);
     }
     @Test
     void Story6() {
         MathProblems problems = new MathProblems();
         float[] param = { 10,15,5};
         float result = problems.Story6(param);
         assertEquals(30, result);
     }
}
