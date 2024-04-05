package via.doc1.ex8.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeamMemberTest {

    @Test
    public void testConstructorAndGetters() {
        // Create tasks
        Task task1 = new Task("Task1", "Task 1", "Description of Task 1");
        Task task2 = new Task("Task2", "Task 2", "Description of Task 2");
        List<Task> tasks = new ArrayList<>();
        tasks.add(task1);
        tasks.add(task2);

        // Create a TeamMember
        TeamMember member = new TeamMember("1", "John Doe", "john@example.com", tasks);

        // Test getters
        assertEquals("1", member.getId());
        assertEquals("John Doe", member.getName());
        assertEquals("john@example.com", member.getEmail());
        assertEquals(tasks, member.getTasks());
    }

    @Test
    public void testSetters() {
        // Create a TeamMember
        TeamMember member = new TeamMember("1", "John Doe", "john@example.com", new ArrayList<>());

        // Set new values
        member.setId("2");
        member.setName("Jane Doe");
        member.setEmail("jane@example.com");
        member.setTasks(new ArrayList<>()); // Set empty list of tasks

        // Test getters after setting new values
        assertEquals("2", member.getId());
        assertEquals("Jane Doe", member.getName());
        assertEquals("jane@example.com", member.getEmail());
        assertEquals(new ArrayList<>(), member.getTasks()); // Check if tasks are set correctly
    }

    @Test
    public void testToString() {
        // Create a TeamMember
        TeamMember member = new TeamMember("1", "John Doe", "john@example.com", new ArrayList<>());

        // Test toString method
        assertEquals("TeamMember{id='1', name='John Doe', email='john@example.com'}", member.toString());
    }
}
