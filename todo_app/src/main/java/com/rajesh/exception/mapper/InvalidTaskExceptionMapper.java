package com.rajesh.exception.mapper;

import com.rajesh.exception.InvalidTaskException;
import com.rajesh.util.ApiUtil;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
/**
 * InvalidTaskExceptionMapper class is an exception mapper class that handles
 * the InvalidTaskException and generates an error response.
 */
public class InvalidTaskExceptionMapper implements ExceptionMapper<InvalidTaskException> {

    @Override
    /**
     * method to generate a response for InvalidTaskException.
     */
    public Response toResponse(InvalidTaskException exception) {
        // return response with status code and error message
        return Response.status(exception.getErrorStatusCode())
                .entity(ApiUtil.buildApiResponse(exception.getErrorStatusCode(), exception.getMessage(), null)).build();
    }
}
