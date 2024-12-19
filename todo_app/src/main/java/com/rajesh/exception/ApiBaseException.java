package com.rajesh.exception;

/**
 * Base exception class for API exceptions.
 */
public class ApiBaseException extends RuntimeException {

    // error status code
    private int errorStatusCode;

    /**
     * Constructor to create an exception with message and error status code.
     * 
     * @param message
     * @param errorStatusCode
     */
    public ApiBaseException(String message, int errorStatusCode) {
        // call super class constructor
        super(message);
        // set error status code
        this.errorStatusCode = errorStatusCode;
    }

    /**
     * Get error status code.
     * 
     * @return error status code
     */
    public int getErrorStatusCode() {
        return errorStatusCode;
    }

    /**
     * Set error status code.
     * 
     * @param errorStatusCode error status code
     */
    public void setErrorStatusCode(int errorStatusCode) {
        this.errorStatusCode = errorStatusCode;
    }
}
