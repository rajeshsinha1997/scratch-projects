package com.rajesh.model.api;

/**
 * ApiResponse class is a model class which is used to send the response to the
 * client. It contains the status code, message and data.
 */
public class ApiResponse {
    // Status code of the response
    private int apiResponseStatusCode;
    // Message of the response
    private String apiResponseMessage;
    // Data of the response
    private Object apiResponseData;

    /**
     * Get the status code of the response
     * 
     * @return status code of the response
     */
    public int getApiResponseStatusCode() {
        return apiResponseStatusCode;
    }

    /**
     * Set the status code of the response
     * 
     * @param apiResponseStatusCode status code of the response
     */
    public void setApiResponseStatusCode(int apiResponseStatusCode) {
        this.apiResponseStatusCode = apiResponseStatusCode;
    }

    /**
     * Get the message of the response
     * 
     * @return message of the response
     */
    public String getApiResponseMessage() {
        return apiResponseMessage;
    }

    /**
     * Set the message of the response
     * 
     * @param apiResponseMessage message of the response
     */
    public void setApiResponseMessage(String apiResponseMessage) {
        this.apiResponseMessage = apiResponseMessage;
    }

    /**
     * Get the data of the response
     * 
     * @return data of the response
     */
    public Object getApiResponseData() {
        return apiResponseData;
    }

    /**
     * Set the data of the response
     * 
     * @param apiResponseData data of the response
     */
    public void setApiResponseData(Object apiResponseData) {
        this.apiResponseData = apiResponseData;
    }
}
