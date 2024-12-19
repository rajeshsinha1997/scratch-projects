package com.rajesh.util;

import com.rajesh.model.api.ApiResponse;

/**
 * ApiUtil class is a utility class to build the API related utility services.
 */
public class ApiUtil {
    /**
     * buildApiResponse method is used to build the API response object.
     * 
     * @param apiResponseStatusCode status code of the API response
     * @param apiResponseMessage    message of the API response
     * @param apiResponseData       data of the API response
     * @return ApiResponse object
     */
    public static ApiResponse buildApiResponse(int apiResponseStatusCode, String apiResponseMessage,
            Object apiResponseData) {
        // Create the ApiResponse object
        ApiResponse apiResponse = new ApiResponse();

        // Set the ApiResponse object properties
        apiResponse.setApiResponseStatusCode(apiResponseStatusCode);
        apiResponse.setApiResponseMessage(apiResponseMessage);
        apiResponse.setApiResponseData(apiResponseData);

        // Return the ApiResponse object
        return apiResponse;
    }
}
