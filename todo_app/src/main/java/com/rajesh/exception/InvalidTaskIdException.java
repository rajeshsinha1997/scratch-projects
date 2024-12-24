package com.rajesh.exception;

/**
 * Custom exception to handle invalid task id.
 */
public class InvalidTaskIdException extends ApiBaseException {
    /**
     * Constructor to create InvalidTaskIdException object.
     * 
     * @param errorMessage    error message to be set in response
     * @param errorStatusCode status code to be set in response
     */
    public InvalidTaskIdException(String errorMessage, int errorStatusCode) {
        // call super class constructor
        super(errorMessage, errorStatusCode);
    }

}
