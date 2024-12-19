package com.rajesh.exception;

/**
 * Custom exception to handle invalid task object.
 */
public class InvalidTaskException extends ApiBaseException {
    /**
     * Constructor to create InvalidTaskException object.
     * 
     * @param errorStatusCode status code to be set in response
     * @param errorMessage    error message to be set in response
     */
    public InvalidTaskException(String errorMessage, int errorStatusCode) {
        // call super class constructor
        super(errorMessage, errorStatusCode);
    }
}
