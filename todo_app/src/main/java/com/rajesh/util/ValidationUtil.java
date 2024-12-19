package com.rajesh.util;

import com.rajesh.exception.InvalidTaskException;
import com.rajesh.model.core.Task;

import jakarta.ws.rs.core.Response;

/**
 * Utility class to perform validations.
 */
public class ValidationUtil {
    /**
     * Validates a given task object.
     * 
     * @param task task object to validate
     */
    public static void validateTaskObject(Task task) {
        // check if the title of the given task object is null
        if (task.getTaskTitle() == null || task.getTaskTitle().isBlank()) {
            // throw exception if the title is null
            throw new InvalidTaskException("INVALID TASK TITLE: " + task.getTaskTitle(),
                    Response.Status.BAD_REQUEST.getStatusCode());
        }

        // check if the description of the given task object is null
        if (task.getTaskDescription() == null || task.getTaskDescription().isBlank()) {
            // throw exception if the description is null
            throw new InvalidTaskException("INVALID TASK DESCRIPTION: " + task.getTaskDescription(),
                    Response.Status.BAD_REQUEST.getStatusCode());
        }
    }
}
