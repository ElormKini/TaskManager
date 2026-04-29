package edu.unomaha.project;


public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask("Finish homework");
        manager.addTask("Buy groceries");

        System.out.println("Total tasks: " + manager.getTaskCount());
        System.out.println("First task: " + manager.getTask(0).getTitle());
    }
}

