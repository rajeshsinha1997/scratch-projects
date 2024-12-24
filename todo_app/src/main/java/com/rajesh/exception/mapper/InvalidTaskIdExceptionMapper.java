package com.rajesh.exception.mapper;

import com.rajesh.exception.InvalidTaskIdException;
import com.rajesh.util.ApiUtil;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
/**
 * InvalidTaskIdExceptionMapper class is an exception mapper class that handles
 * the InvalidTaskIdException and generates an error response.
 */
public class InvalidTaskIdExceptionMapper implements ExceptionMapper<InvalidTaskIdException> {

    @Override
    /**
     * method to generate a response for InvalidTaskIdException.
     */
    public Response toResponse(InvalidTaskIdException exception) {
        // return response with status code and error message
        return Response.status(exception.getErrorStatusCode())
                .entity(ApiUtil.buildApiResponse(exception.getErrorStatusCode(), exception.getMessage(), null)).build();
    }

}
