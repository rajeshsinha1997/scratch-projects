package com.rajesh.resource;

import com.rajesh.dto.request.CreateTaskRequestDTO;
import com.rajesh.dto.response.TaskResponseDTO;
import com.rajesh.exception.InvalidTaskIdException;
import com.rajesh.service.TaskService;
import com.rajesh.util.ApiUtil;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
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
				.ok(ApiUtil.buildApiResponse(Response.Status.OK.getStatusCode(), null,
						taskService.getAllTasks()))
				.build();
	}

	@GET
	@Path("/{taskId}")
	/**
	 * method to handle GET requests to fetch a task by id.
	 * 
	 * @param taskId id of the task to be fetched
	 * @return Response object
	 */
	public Response getTaskById(@PathParam("taskId") String taskId) {
		// check if the given task id is blank
		checkIfTaskIdIsBlank(taskId);

		// call service method to get task by id
		TaskResponseDTO task = taskService.getTaskById(taskId);

		// check no task exists with the given id
		if (task == null) {
			// return response with status code 404
			return sendTaskNotFoundByIdResponse(taskId);
		}

		// get task by id and return response with status code 200
		return Response
				.ok(ApiUtil.buildApiResponse(Response.Status.OK.getStatusCode(), null, task))
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

	@DELETE
	@Path("/{taskId}")
	/**
	 * method to handle DELETE requests to delete a task by id.
	 * 
	 * @param taskId id of the task to be deleted
	 * @return Response object
	 */
	public Response deleteTaskById(@PathParam("taskId") String taskId) {
		// check if the given task id is blank
		checkIfTaskIdIsBlank(taskId);

		// call service method to delete task by id
		TaskResponseDTO deletedTask = taskService.deleteTaskById(taskId);

		// check no task exists with the given id
		if (deletedTask == null) {
			// return response with status code 404
			return sendTaskNotFoundByIdResponse(taskId);
		}

		// get task by id and return response with status code 200
		return Response
				.ok(ApiUtil.buildApiResponse(Response.Status.OK.getStatusCode(), null, deletedTask))
				.build();
	}

	/**
	 * Method to check if the given task id is null or blank.
	 * 
	 * @param taskId id of the task to be checked
	 */
	private void checkIfTaskIdIsBlank(String taskId) {
		// check if the given task id is null or blank
		if (taskId == null || taskId.isBlank()) {
			// throw InvalidTaskIdException if task id is blank
			throw new InvalidTaskIdException("TASK ID CANNOT BE EMPTY",
					Response.Status.BAD_REQUEST.getStatusCode());
		}
	}

	/**
	 * Method to send response with status code 404 if no task exists with the given
	 * id.
	 * 
	 * @param taskId id of the task
	 * @return Response object
	 */
	private Response sendTaskNotFoundByIdResponse(String taskId) {
		// return response with status code 404
		return Response.status(Response.Status.NOT_FOUND)
				.entity(ApiUtil.buildApiResponse(Response.Status.NOT_FOUND.getStatusCode(),
						"NO TASK EXISTS WITH ID: " + taskId, null))
				.build();
	}
}
