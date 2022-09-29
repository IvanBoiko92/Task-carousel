package com.epam.rd.autotasks;

import java.util.ArrayList;

public class TaskCarousel {
    private int capacity = 0;
    private int currentCapacity = 0;
    private int currentExecuted = 0;
    private ArrayList<Task> tasks;
    public TaskCarousel(int capacity) {
        this.capacity = capacity-1;
        this.tasks = new ArrayList<>();
    }

    public boolean addTask(Task task) {
        if(task == null || task.isFinished() || isFull()) return false;
        tasks.add(currentCapacity, task);
        if(!isFull()) currentCapacity++;
        return true;
    }
    public boolean execute() {
        if(isEmpty()) return false;
        tasks.get(currentExecuted).execute();
        if(tasks.get(currentExecuted).isFinished()) {
            tasks.remove(currentExecuted);
            if(currentCapacity != 0) currentCapacity--;
        } else {
            currentExecuted++;
        }
        if(currentExecuted == tasks.size()) {
            currentExecuted = 0;
        }
        return true;
    }
    public boolean isFull() {
        if(tasks.size() == capacity+1) return true;
        return false;
    }
    public boolean isEmpty() {
        if(tasks.size() == 0) return true;
        return false;
    }
}
