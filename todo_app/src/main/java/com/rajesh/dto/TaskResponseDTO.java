package com.rajesh.dto;

/**
 * TaskResponseDTO class is a data transfer object class that is used to send
 * task data to the client.
 */
public class TaskResponseDTO {
    // attributes of the data transfer object
    private String taskId;
    private String taskTitle;
    private String taskDescription;
    private boolean taskCompleted;
    private String taskCreatedOn;
    private String taskUpdatedOn;

    /**
     * Get the task id
     * 
     * @return task id as a string
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * Set the task id
     * 
     * @param taskId task id to set
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * Get the task title
     * 
     * @return task title as a string
     */
    public String getTaskTitle() {
        return taskTitle;
    }

    /**
     * Set the task title
     * 
     * @param taskTitle task title to set
     */
    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    /**
     * Get the task description
     * 
     * @return task description as a string
     */
    public String getTaskDescription() {
        return taskDescription;
    }

    /**
     * Set the task description
     * 
     * @param taskDescription task description to set
     */
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    /**
     * Check if the task is completed
     * 
     * @return true if the task is completed, false otherwise
     */
    public boolean isTaskCompleted() {
        return taskCompleted;
    }

    /**
     * Set the task completion status
     * 
     * @param taskCompleted task completion status to set
     */
    public void setTaskCompleted(boolean taskCompleted) {
        this.taskCompleted = taskCompleted;
    }

    /**
     * Get the task creation date and time
     * 
     * @return task creation date and time as a string
     */
    public String getTaskCreatedOn() {
        return taskCreatedOn;
    }

    /**
     * Set the task creation date and time
     * 
     * @param taskCreatedOn task creation date and time to set
     */
    public void setTaskCreatedOn(String taskCreatedOn) {
        this.taskCreatedOn = taskCreatedOn;
    }

    /**
     * Get the task updated date and time
     * 
     * @return task updated date and time as a string
     */
    public String getTaskUpdatedOn() {
        return taskUpdatedOn;
    }

    /**
     * Set the task updated date and time
     * 
     * @param taskUpdatedOn task updated date and time to set
     */
    public void setTaskUpdatedOn(String taskUpdatedOn) {
        this.taskUpdatedOn = taskUpdatedOn;
    }

}
