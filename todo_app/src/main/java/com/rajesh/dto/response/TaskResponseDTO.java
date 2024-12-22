package com.rajesh.dto.response;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * TaskResponseDTO class is a data transfer object class that is used to send
 * task data to the client.
 */
public class TaskResponseDTO {
    @JsonbProperty("task_id")
    // id of the task
    private String taskId;

    @JsonbProperty("task_title")
    // title of the task
    private String taskTitle;

    @JsonbProperty("task_description")
    // description of the task
    private String taskDescription;

    @JsonbProperty("task_completed")
    // completion status of the task
    private boolean taskCompleted;

    @JsonbProperty("task_created_on")
    // creation date and time of the task
    private String taskCreatedOn;

    @JsonbProperty("task_updated_on")
    // last updated date and time of the task
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
     * Get the task last updated date and time
     * 
     * @return task last updated date and time as a string
     */
    public String getTaskUpdatedOn() {
        return taskUpdatedOn;
    }

    /**
     * Set the task last updated date and time
     * 
     * @param taskUpdatedOn task last updated date and time to set
     */
    public void setTaskUpdatedOn(String taskUpdatedOn) {
        this.taskUpdatedOn = taskUpdatedOn;
    }

}
