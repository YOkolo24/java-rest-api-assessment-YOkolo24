package com.cbfacademy.apiassessment.tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.context.annotation.Description;
import org.springframework.http.ResponseEntity;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest(classes = TasksController.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TasksControllerTests {
    
    @LocalServerPort
	private int port;

	private URL base;

	@Autowired
	private TestRestTemplate restTemplate;

	@BeforeEach
	public void setUp() throws Exception {
		this.base = new URL("http://localhost:" + port + "/tasks");
	}

    @Test
	public void testGetAllTasks() {
		List<Tasks> tasks = new ArrayList<>() {
			{
				add(new Tasks(2, "Pull all changes from GitHub", false, getInstant(24)));
				add(new Tasks(3, "Work on debugging for Project 3", , getInstant(48)));
				add(new Tasks(1, "Complete testing for Project 1", true, getInstant(72)));
			}
		};

		for (Tasks tasks : tasks) {
			restTemplate.postForEntity("/tasks/", tasks, Tasks.class);
		}

		ResponseEntity<Tasks[]> response = restTemplate.getForEntity("/tasks/", Tasks[].class);
		Tasks[] responseTasks = response.getBody();

		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertNotNull(responseTasks);
		assertTrue(tasks.size() <= responseTasks.length);
	}
}
