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

    /**
     * generateUUID method is used to generate a UUID.
     * 
     * @return UUID as a string
     */
    public static String generateUUID() {
        // Return the generated UUID as a string
        return java.util.UUID.randomUUID().toString();
    }

    /**
     * getCurrentDateTime method is used to get the current date and time.
     * 
     * @return
     */
    public static String getCurrentDateTime() {
        // Return the current date and time as a string
        return java.time.LocalDateTime.now().toString();
    }
}
