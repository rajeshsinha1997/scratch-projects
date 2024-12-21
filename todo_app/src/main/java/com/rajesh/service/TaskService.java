package com.rajesh.service;

import java.util.ArrayList;
import java.util.List;

import com.rajesh.dao.TaskDAO;
import com.rajesh.dto.CreateTaskRequestDTO;
import com.rajesh.dto.TaskResponseDTO;
import com.rajesh.model.core.Task;
import com.rajesh.util.ApiUtil;
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
    public List<TaskResponseDTO> getAllTasks() {
        // call DAO method to get all tasks present in the data-store
        List<Task> taskListFromDataStore = taskDAO.getAllTasks();

        // create a new list to store TaskResponseDTO objects
        List<TaskResponseDTO> tasksPresentAsDTO = new ArrayList<>();

        // iterate over the list of tasks
        for (Task task : taskListFromDataStore) {
            // create a TaskResponseDTO object from the Task object and add it to the list
            // to be returned
            tasksPresentAsDTO.add(createTaskResponseDTOFromTask(task));
        }

        // return the list of TaskResponseDTO objects
        return tasksPresentAsDTO;
    }

    /**
     * Method to add a task
     * 
     * @param taskToBeCreated task object to add
     * @return added task object
     */
    public TaskResponseDTO addTask(CreateTaskRequestDTO taskToBeCreated) {
        // validate the task title
        ValidationUtil.validateTaskTitle(taskToBeCreated.getTaskTitle());

        // validate the task description
        ValidationUtil.validateTaskDescription(taskToBeCreated.getTaskDescription());

        // create a new task object
        Task newTask = new Task();

        // set the task object properties
        newTask.setTaskId(ApiUtil.generateUUID());
        newTask.setTaskTitle(taskToBeCreated.getTaskTitle());
        newTask.setTaskDescription(taskToBeCreated.getTaskDescription());
        newTask.setTaskCompleted(false);
        newTask.setTaskCreatedOn(ApiUtil.getCurrentDateTime());
        newTask.setTaskUpdatedOn(ApiUtil.getCurrentDateTime());

        // call DAO method to add the received task object to the data-store
        taskDAO.addTask(newTask);

        // return the added task object
        return createTaskResponseDTOFromTask(newTask);
    }

    /**
     * Method to create a TaskResponseDTO object from a Task object
     * 
     * @param task Task object instance
     * @return TaskResponseDTO object instance
     */
    private TaskResponseDTO createTaskResponseDTOFromTask(Task task) {
        // create a new TaskResponseDTO object
        TaskResponseDTO taskResponseDTO = new TaskResponseDTO();

        // set the properties of the TaskResponseDTO object
        taskResponseDTO.setTaskId(task.getTaskId());
        taskResponseDTO.setTaskTitle(task.getTaskTitle());
        taskResponseDTO.setTaskDescription(task.getTaskDescription());
        taskResponseDTO.setTaskCompleted(task.isTaskCompleted());
        taskResponseDTO.setTaskCreatedOn(task.getTaskCreatedOn());
        taskResponseDTO.setTaskUpdatedOn(task.getTaskUpdatedOn());

        // return the TaskResponseDTO object
        return taskResponseDTO;
    }
}
