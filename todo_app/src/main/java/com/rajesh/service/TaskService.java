package com.rajesh.service;

import java.util.List;

import com.rajesh.dao.TaskDAO;
import com.rajesh.model.core.Task;
import com.rajesh.util.ValidationUtil;

/**
 * Service class to handle business logic for Task entity
 */
public class TaskService {
    // instance of TaskDAO to interact with database
    private final TaskDAO taskDAO = new TaskDAO();

    /**
     * Method to get all tasks
     * 
     * @return list of all tasks
     */
    public List<Task> getAllTasks() {
        // call DAO method to get all tasks and return the list
        return taskDAO.getAllTasks();
    }

    /**
     * Method to add a task
     * 
     * @param task task object to add
     * @return added task object
     */
    public Task addTask(Task task) {
        // validate task object to check if all required fields are present
        ValidationUtil.validateTaskObject(task);

        // call DAO method to add the received task object to the data-store
        taskDAO.addTask(task);

        // return the added task object
        return task;
    }
}
