package com.rajesh.dto;

/**
 * CreateTaskRequestDTO class is a data transfer object class that represents an
 * object received in the POST request body to create a new task.
 */
public class CreateTaskRequestDTO {
    // title of the task object to be created
    private String taskTitle;
    // description of the task object to be created
    private String taskDescription;

    /**
     * Get the title of the task object to be created
     * 
     * @return
     */
    public String getTaskTitle() {
        return taskTitle;
    }

    /**
     * Set the title of the task object to be created
     * 
     * @param taskTitle
     */
    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    /**
     * Get the description of the task object to be created
     * 
     * @return
     */
    public String getTaskDescription() {
        return taskDescription;
    }

    /**
     * Set the description of the task object to be created
     * 
     * @param taskDescription
     */
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

}
