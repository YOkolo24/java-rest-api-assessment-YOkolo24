package com.cbfacademy.apiassessment.controller;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cbfacademy.apiassessment.service.ResponsesModel;
import com.cbfacademy.apiassessment.service.TasksService;
import com.cbfacademy.apiassessment.tasks.Tasks; 

@RestController
@RequestMapping("/tasks")
public class TasksController {

    @Autowired
    TasksService tasksService;

    // Example test endpoint
    @GetMapping("/ping")
	public String ping() {
		return String.format("Service running successfully " + Instant.now().toString());
	}

    // Create new task endpoint
    @PostMapping("/")
    public ResponsesModel createTask(@RequestBody Tasks tasks) {
        return tasksService.createTask(tasks);
    }

    // Display all existing tasks endpoint
    @GetMapping("/all")
    public ResponsesModel getAllTasks() {
        return tasksService.getAllTasks();
    }

    // Return specific task by ID endpoint
    @GetMapping("/{id}")
    public ResponsesModel getTaskById(@PathVariable Integer id) {
        return tasksService.getTaskById(id);
    }

    // Update an existing task by ID endpoint
    @PutMapping("/{id}")
    public ResponsesModel updateTask(@RequestBody Tasks tasks) {
        return tasksService.updateTask(tasks);
    }

    // Delete a specific task by ID
    @DeleteMapping("/{id}")
    public ResponsesModel deleteTask(@PathVariable Integer id) {
        return tasksService.deleteTask(id);
    }

    //Search for task by priority score endpoint
    @GetMapping("/priority/{priorityScoreOutOfFive}")
    public ResponsesModel searchForTaskByPriorityScore(@PathVariable Integer priorityScoreOutOfFive) {
        return tasksService.searchForTaskByPriorityScore(priorityScoreOutOfFive);
    }
    
}
