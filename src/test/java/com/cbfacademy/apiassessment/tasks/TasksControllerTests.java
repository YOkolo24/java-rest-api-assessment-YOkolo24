package com.cbfacademy.apiassessment.tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.context.annotation.Description;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.cbfacademy.apiassessment.controller.TasksController;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest(classes = TasksController.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TasksControllerTests {
    
//     @LocalServerPort
// 	private int port;

// 	private URL base;

// 	@Autowired
// 	private TestRestTemplate restTemplate;

// 	@BeforeEach
// 	public void setUp() throws Exception {
// 		this.base = new URL("http://localhost:" + port + "/tasks");
// 	}

//     @Test
// 	@Description("/ping endpoint returns expected response")
// 	public void ping_ExpectedResponse() {
// 		ResponseEntity<String> response = restTemplate.getForEntity(base.toString() + "/ping", String.class);

// 		assertEquals(200, response.getStatusCode().value());
// 		assertTrue(response.getBody().startsWith("Service running successfully"));
// 	}

//     @Test
// 	public void testGetAllTasks() {
// 		List<Tasks> tasks = new ArrayList<>() {
// 			{
// 				add(new Tasks(2, "Pull all changes from GitHub", 2, false));
// 				add(new Tasks(3, "Work on debugging for Project 3", 5, false));
// 				add(new Tasks(1, "Complete testing for Project 1", 3, true));
// 			}
// 		};

// 		for (Tasks task : tasks) {
// 			restTemplate.postForEntity("/tasks/", task, Tasks.class);
// 		}

// 		ResponseEntity<Tasks[]> response = restTemplate.getForEntity("/tasks/", Tasks[].class);
// 		Tasks[] responseTasks = response.getBody();

// 		assertEquals(HttpStatus.OK, response.getStatusCode());
// 		assertNotNull(responseTasks);
// 		assertTrue(tasks.size() <= responseTasks.length);
// 	}   
    
//     @Test
// 	public void testGetTaskById() {
// 		Tasks task = new Tasks(2, "Pull all changes from GitHub", 2, false);
// 		ResponseEntity<Tasks> createResponse = restTemplate.postForEntity("/tasks/", task, Tasks.class);

// 		Tasks createdTask = createResponse.getBody();
// 		ResponseEntity<Tasks> response = restTemplate.getForEntity("/tasks/" + createdTask.getId(), Tasks.class);

// 		assertEquals(HttpStatus.OK, response.getStatusCode());
// 		assertNotNull(response.getBody());
// 		assertEquals(createdTask.getId(), response.getBody().getId());
// 	}

//     @Test
// 	public void testCreateTask() {
// 		Tasks task = new Tasks(2, "Pull all changes from GitHub", 2, false);
// 		ResponseEntity<Tasks> response = restTemplate.postForEntity("/tasks/", task, Tasks.class);

// 		assertEquals(HttpStatus.OK, response.getStatusCode());
// 		assertNotNull(response.getBody());
// 		assertNotNull(response.getBody().getId());
// 	}

//     @Test
// 	public void testUpdateTasks() {
// 		Tasks task = new Tasks(2, "Pull changes from GitHub", 2, false);
// 		ResponseEntity<Tasks> createResponse = restTemplate.postForEntity("/tasks/", task, Tasks.class);

// 		Tasks createdTask = createResponse.getBody();
// 		createdTask.setTaskDetails("UpdatedTask");

// 		restTemplate.put("/tasks/" + createdTask.getId(), createdTask);
// 		ResponseEntity<Tasks> response = restTemplate.getForEntity("/tasks/" + createdTask.getId(), Tasks.class);

// 		assertEquals(HttpStatus.OK, response.getStatusCode());
// 		assertNotNull(response.getBody());
// 		assertEquals("UpdatedTask", response.getBody().getTaskDetails());
// 	}

//     @Test
// 	public void testDeleteTask() {
// 		Tasks task = new Tasks(2, "Pull changes from GitHub", 2, false );
// 		ResponseEntity<Tasks> createResponse = restTemplate.postForEntity("/tasks/", task, Tasks.class);

// 		Tasks createdTask = createResponse.getBody();
// 		restTemplate.delete("/tasks/" + createdTask.getId());

// 		ResponseEntity<Tasks> response = restTemplate.getForEntity("/tasks/" + createdTask.getId(), Tasks.class);

// 		assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
// 	}
}
