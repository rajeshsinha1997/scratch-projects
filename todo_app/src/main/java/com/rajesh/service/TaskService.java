package com.rajesh.service;

import java.util.ArrayList;
import java.util.List;

import com.rajesh.dao.TaskDAO;
import com.rajesh.dto.request.CreateTaskRequestDTO;
import com.rajesh.dto.response.TaskResponseDTO;
import com.rajesh.model.Task;
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
     * Method to get a task by its id
     * 
     * @param taskId id of the task to be fetched
     * @return task object if found, null otherwise
     */
    public TaskResponseDTO getTaskById(String taskId) {
        // call DAO method to get the task object by its id
        Task task = taskDAO.getTaskById(taskId);

        // if task is not found, return null
        if (task == null) {
            return null;
        }

        // create a TaskResponseDTO object from the Task object and return it
        return createTaskResponseDTOFromTask(task);
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
        newTask.setTaskTitle(taskToBeCreated.getTaskTitle());
        newTask.setTaskDescription(taskToBeCreated.getTaskDescription());
        newTask.setTaskCompleted(false);
        newTask.setTaskDeleted(false);
        newTask.setTaskCreatedOn(ApiUtil.getCurrentDateTime());
        newTask.setTaskUpdatedOn(ApiUtil.getCurrentDateTime());

        // check if the generated task id already exists, if yes, generate a new task id
        do {
            // generate a new task id
            newTask.setTaskId(ApiUtil.generateUUID());
        } while (taskDAO.getTaskById(newTask.getTaskId()) != null);

        // call DAO method to add the received task object to the data-store
        taskDAO.addTask(newTask);

        // return the added task object
        return createTaskResponseDTOFromTask(newTask);
    }

    /**
     * Method to delete a task by its id
     * 
     * @param taskId id of the task to be deleted
     * @return deleted task object if found, null otherwise
     */
    public TaskResponseDTO deleteTaskById(String taskId) {
        // call DAO method to delete the task object by its id
        Task deletedTask = taskDAO.deleteTaskById(taskId);

        // check if the deleted task object is null
        if (deletedTask == null) {
            // return null if the deleted task object is null
            return null;
        } else {
            // return the deleted task object
            return createTaskResponseDTOFromTask(deletedTask);
        }
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
