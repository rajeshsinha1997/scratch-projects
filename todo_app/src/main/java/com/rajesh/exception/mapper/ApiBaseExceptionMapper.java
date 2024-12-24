package com.rajesh.exception.mapper;

import com.rajesh.exception.ApiBaseException;
import com.rajesh.util.ApiUtil;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
/**
 * ApiBaseExceptionMapper class is an exception mapper class that handles the
 * ApiBaseException and generates an error response.
 */
public class ApiBaseExceptionMapper implements ExceptionMapper<ApiBaseException> {

    @Override
    /**
     * method to generate a response for ApiBaseException.
     */
    public Response toResponse(ApiBaseException exception) {
        // return response with status code and error message
        return Response.status(exception.getErrorStatusCode())
                .entity(ApiUtil.buildApiResponse(exception.getErrorStatusCode(), exception.getMessage(), null)).build();
    }

}
