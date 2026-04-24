package src.main.java.edu.unomaha.project;

import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }


    public void addTask(String title) {
        tasks.add(new Task(title));
    }

   
    public int getTaskCount() {
        return tasks.size();
    }

   
    public Task getTask(int index) {
        return tasks.get(index);
    }
}
