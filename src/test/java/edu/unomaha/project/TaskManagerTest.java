package src.test.java.edu.unomaha.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import src.main.java.edu.unomaha.project.TaskManager;


public class TaskManagerTest {

    @Test
    public void testAddTask() {
        TaskManager manager = new TaskManager();

        manager.addTask("Test Task");

     
        assertEquals(1, manager.getTaskCount());

        assertEquals("Test Task", manager.getTask(0).getTitle());
    }
}
