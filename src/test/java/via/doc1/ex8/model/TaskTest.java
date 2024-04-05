package via.doc1.ex8.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void ctorTest()
    {
        String taskId = "Task1";
        String taskName = "Tough task";
        String taskDesc = "Cleanup the mess";
        Task testTask = new Task(taskId, taskName, taskDesc);
        testTask.setId("1");
        testTask.setName("DOKA");
        testTask.setDescription("Demon");
        assertTrue(testTask.getId().equals("1"));
        assertTrue(testTask.getName().equals("DOKA"));
        assertTrue(testTask.getDescription().equals("Demon"));

    }


    @Test
    public void testEquals() {
        String taskId = "Task1";
        String taskName = "Tough task";
        String taskDesc = "Cleanup the mess";
        Task testTask1 = new Task(taskId, taskName, taskDesc);
        Task testTask2 = new Task(taskId, taskName, taskDesc);

        // Test when objects are equal
        assertEquals(testTask1, testTask2);

        // Test when objects are not equal
        testTask2.setId("2");
        assertTrue(!testTask1.equals(testTask2));
    }

    @Test
    public void testHashCode() {
        String taskId = "Task1";
        String taskName = "Tough task";
        String taskDesc = "Cleanup the mess";
        Task testTask1 = new Task(taskId, taskName, taskDesc);
        Task testTask2 = new Task(taskId, taskName, taskDesc);

        // Test when objects are equal
        assertEquals(testTask1.hashCode(), testTask2.hashCode());

        // Test when objects are not equal
        testTask2.setId("2");
        assertTrue(testTask1.hashCode() != testTask2.hashCode());
    }
}
