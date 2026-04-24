package src.main.java.edu.unomaha.project;

import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    // WORKING FEATURE: Add Task
    public void addTask(String title) {
        tasks.add(new Task(title));
    }

    // WORKING FEATURE: Get Task Count
    public int getTaskCount() {
        return tasks.size();
    }

    // WORKING FEATURE: Get Task
    public Task getTask(int index) {
        return tasks.get(index);
    }
}
