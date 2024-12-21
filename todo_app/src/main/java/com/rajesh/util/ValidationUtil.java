package com.rajesh.util;

import com.rajesh.exception.InvalidTaskException;
import jakarta.ws.rs.core.Response;

/**
 * Utility class to perform validations.
 */
public class ValidationUtil {
    /**
     * Validates a given task title.
     * 
     * @param taskTitle task title to validate
     */
    public static void validateTaskTitle(String taskTitle) {
        // check if the title is null or blank
        if (taskTitle == null || taskTitle.isBlank()) {
            // throw exception if the title is null or blank
            throw new InvalidTaskException("INVALID TASK TITLE: " + taskTitle,
                    Response.Status.BAD_REQUEST.getStatusCode());
        }
    }

    /**
     * Validates a given task description.
     * 
     * @param taskDescription task description to validate
     */
    public static void validateTaskDescription(String taskDescription) {
        // check if the description is null or blank
        if (taskDescription == null || taskDescription.isBlank()) {
            // throw exception if the description is null or blank
            throw new InvalidTaskException("INVALID TASK DESCRIPTION: " + taskDescription,
                    Response.Status.BAD_REQUEST.getStatusCode());
        }
    }
}
