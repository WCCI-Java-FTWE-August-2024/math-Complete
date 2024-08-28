import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import wcci.org.MathProblems;

public class MathRandomTest {
    // Story 31: Generating a Random Dice Roll
    @Test
    void Story31() {
        MathProblems problems = new MathProblems();
        int result = problems.Story31();
        assertTrue(1 <= result && result <= 6);
    }

    // Story 32: Generating Random Scores for a Quiz
    @Test
    void Story32() {
        MathProblems problems = new MathProblems();
        int result = problems.Story32();
        assertTrue(0 <= result && result <= 100);
    }

    // Story 33: Randomly Assigning Tasks
    @Test
    public void Story33() {
        MathProblems problems = new MathProblems();
        List<String> tasks = List.of("Task 1", "Task 2", "Task 3", "Task 4", "Task 5");
        List<String> teamMembers = List.of("Member 1", "Member 2", "Member 3", "Member 4", "Member 5");

        Map<String, String> assignments = problems.Story33(tasks, teamMembers);

        assertEquals(5, assignments.size());
        for (String member : teamMembers) {
            assertTrue(assignments.containsKey(member));
        }
        for (String task : tasks) {
            assertTrue(assignments.containsValue(task));
        }
    }

    // Story 34: Generating Random Game Events
    @Test
    void Story34() {
        MathProblems problems = new MathProblems();
        List<String> eventList = List.of("find treasure", "meet a monster", "nothing happens");
        String result = problems.Story34(eventList);
        assertTrue(eventList.contains(result));
    }
//Story 35: Randomly Selecting a Discount
@Test
    void Story35() {
        MathProblems problems = new MathProblems();
        int result = problems.Story35();
        assertTrue(10 <= result && result <= 30);
    }
    //Story 36: Generating Random Passwords
    @Test
    public void Story36() {
        MathProblems problems = new MathProblems();
        String password = problems.Story36(8);
        assertTrue(password.length() == 8);
    }
    //Story 37: Randomly Selecting a Restaurant
    @Test
    public void Story37() {
        MathProblems problems = new MathProblems();
        List<String> param = List.of( "Restaurant 1.","Restaurant 2.","Restaurant 3.", "Restaurant 4.","Restaurant 5.");
        String result = problems.Story37(param);
        assertTrue(param.contains(result));
    }
}
