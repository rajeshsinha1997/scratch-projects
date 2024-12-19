package com.rajesh.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rajesh.model.core.Task;

/**
 * DAO class to interact with the data-store for Task entity.
 */
public class TaskDAO {
    // In-memory data-store to store the task objects.
    private static final Map<Integer, Task> tasks = new HashMap<>();

    /**
     * Get all the tasks from the data-store.
     * 
     * @return List of tasks.
     */
    public List<Task> getAllTasks() {
        // Convert the map values to list and return.
        return TaskDAO.tasks.values().stream().toList();
    }

    /**
     * Get a task by its id.
     * 
     * @param task task object which contains the given id.
     */
    public void addTask(Task task) {
        // Add the task to the data-store.
        TaskDAO.tasks.put(task.getTaskId(), task);
    }
}
