package com.cbfacademy.apiassessment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cbfacademy.apiassessment.service.TasksService;
import com.cbfacademy.apiassessment.tasks.ResponsesModel;
import com.cbfacademy.apiassessment.tasks.Tasks; 

@RestController
@RequestMapping("/tasks")
public class TasksController {

    @Autowired
    TasksService tasksService;

    @PostMapping("/")
    public ResponsesModel createTask(@RequestBody Tasks tasks) {
        return tasksService.createTask(tasks);
    }
    
    // private final List<Tasks> tasks = new ArrayList<>();

    // // Confirmation system is running as expected
    // @GetMapping("/ping")
	// public String ping() {
	// 	return String.format("Service running successfully " + Instant.now().toString());
	// }

    // // Display all existing tasks 
    // @GetMapping(value = "/")
    // public List<Tasks> getAllTasks() {
    //     return tasks;
    // }

    // // Return specific task by ID
    // @GetMapping(value = "/{id}")
    // public ResponseEntity<Tasks> getTaskById(@PathVariable Integer id) {
    //     for (Tasks task : tasks) {
    //         if (task.getId().equals(id)) {
    //             return ResponseEntity.ok(task);
    //         }
    //     }
    //     return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    // }

    // // Create new task
    // @PostMapping(value = "/")
    // public Tasks createTask(@RequestBody Tasks task) {
    //     tasks.add(task);
    //     return task;
    // }

    // // Update an existing task by ID
    // @PutMapping("/{id}")
    // public Tasks updateTask(@PathVariable Integer id, @RequestBody Tasks updatedTask) {
    //     for (Tasks task : tasks) {
    //         if (task.getId().equals(id)) {
    //             task.setTaskDetails(updatedTask.getTaskDetails());
    //             task.setCompleted(updatedTask.isCompleted());
    //             return task;
    //         }
    //     }
    //     return null;
    // }

    // // Delete a specific task by ID
    // @DeleteMapping("/{id}")
    // public void deleteTask(@PathVariable Integer id) {
    //     tasks.removeIf(task -> task.getId().equals(id));
    // }
}
