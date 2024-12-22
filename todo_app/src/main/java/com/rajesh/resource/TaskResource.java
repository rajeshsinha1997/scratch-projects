package com.rajesh.resource;

import com.rajesh.dto.request.CreateTaskRequestDTO;
import com.rajesh.service.TaskService;
import com.rajesh.util.ApiUtil;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/tasks")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
/**
 * TaskResource class is a resource class that provides RESTful services for
 * creating, reading, updating, and deleting tasks.
 */
public class TaskResource {
    // instance of TaskService class
    private final TaskService taskService = new TaskService();

    @GET
    /**
     * method to handle GET requests to fetch all tasks.
     * 
     * @return Response object
     */
    public Response getAllTasks() {
        // return response with status code 200 and list of tasks
        return Response
                .ok(ApiUtil.buildApiResponse(Response.Status.OK.getStatusCode(), null, taskService.getAllTasks()))
                .build();
    }

    @POST
    /**
     * method to handle POST requests to add a new task.
     * 
     * @param task Task object to be added
     * @return Response object
     */
    public Response addTask(CreateTaskRequestDTO taskToBeCreated) {
        // add task to the list and return response with status code 201
        return Response
                .status(Response.Status.CREATED).entity(ApiUtil
                        .buildApiResponse(Response.Status.CREATED.getStatusCode(), null,
                                taskService.addTask(taskToBeCreated)))
                .build();
    }
}
