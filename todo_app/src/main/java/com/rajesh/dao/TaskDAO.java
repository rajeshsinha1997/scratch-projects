package com.rajesh.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rajesh.model.Task;

/**
 * DAO class to interact with the data-store for Task entity.
 */
public class TaskDAO {
    // In-memory data-store to store the task objects.
    private static final Map<String, Task> tasks = new HashMap<>();

    /**
     * Get all the tasks from the data-store.
     * 
     * @return List of tasks.
     */
    public List<Task> getAllTasks() {
        // Filter out the tasks which are not deleted and return the list.
        return TaskDAO.tasks.values().stream().filter(task -> !task.isTaskDeleted()).toList();
    }

    /**
     * Get a task by its id.
     * 
     * @param taskId Id of the task to be fetched.
     * @return Task object if found, null otherwise.
     */
    public Task getTaskById(String taskId) {
        // Get the task from the data-store using the given id.
        Task task = TaskDAO.tasks.get(taskId);

        // Check if the task is not null and not deleted.
        if (task != null && !task.isTaskDeleted()) {
            // Return the task.
            return task;
        }

        // Return null if the task is not found or deleted.
        return null;
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

    /**
     * Delete a task by its id.
     * 
     * @param taskId Id of the task to be deleted.
     * @return Deleted task object if found, null otherwise.
     */
    public Task deleteTaskById(String taskId) {
        // Get the task from the data-store using the given id.
        Task task = getTaskById(taskId);

        // Check if the retrieved task is not null.
        if (task != null) {
            // Mark the task as deleted.
            task.setTaskDeleted(true);
        }

        // Return the task.
        return task;
    }
}
