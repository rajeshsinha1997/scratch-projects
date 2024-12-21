package com.rajesh.model.core;

/**
 * Task class is a model class that represents a task entity.
 */
public class Task {
    // id of the task object
    private String taskId;
    // title of the task object
    private String taskTitle;
    // description of the task object
    private String taskDescription;
    // status of the task object whether it is completed or not
    private boolean isTaskCompleted;
    // the date on which the task object is created
    private String taskCreatedOn;
    // the date on which the task object is last updated
    private String taskUpdatedOn;

    /**
     * Get the id of the task object
     * 
     * @return id of the task object
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * Set the id of the task object
     * 
     * @param taskId id of the task object
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * Get the title of the task object
     * 
     * @return title of the task object
     */
    public String getTaskTitle() {
        return taskTitle;
    }

    /**
     * Set the title of the task object
     * 
     * @param taskTitle title of the task object
     */
    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    /**
     * Get the description of the task object
     * 
     * @return description of the task object
     */
    public String getTaskDescription() {
        return taskDescription;
    }

    /**
     * Set the description of the task object
     * 
     * @param taskDescription description of the task object
     */
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    /**
     * Get the status of the task object
     * 
     * @return status of the task object
     */
    public boolean isTaskCompleted() {
        return isTaskCompleted;
    }

    /**
     * Set the status of the task object
     * 
     * @param isTaskCompleted status of the task object
     */
    public void setTaskCompleted(boolean isTaskCompleted) {
        this.isTaskCompleted = isTaskCompleted;
    }

    /**
     * Get the date on which the task object is created
     * 
     * @return date on which the task object is created
     */
    public String getTaskCreatedOn() {
        return taskCreatedOn;
    }

    /**
     * Set the date on which the task object is created
     * 
     * @param taskCreatedOn date on which the task object is created
     */
    public void setTaskCreatedOn(String taskCreatedOn) {
        this.taskCreatedOn = taskCreatedOn;
    }

    /**
     * Get the date on which the task object is last updated
     * 
     * @return date on which the task object is last updated
     */
    public String getTaskUpdatedOn() {
        return taskUpdatedOn;
    }

    /**
     * Set the date on which the task object is last updated
     * 
     * @param taskUpdatedOn date on which the task object is last updated
     */
    public void setTaskUpdatedOn(String taskUpdatedOn) {
        this.taskUpdatedOn = taskUpdatedOn;
    }

}
