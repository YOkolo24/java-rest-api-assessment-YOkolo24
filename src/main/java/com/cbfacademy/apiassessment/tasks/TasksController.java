package com.cbfacademy.apiassessment.tasks;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*; 

@RestController
@RequestMapping("/tasks")
public class TasksController {
    
    private final List<Tasks> tasks = new ArrayList<>();

    // @GetMapping("/tasks")
	// public String tasks() {
	// 	return String.format("Service running successfully ");
	// }

    @GetMapping(value = "/tasks")
    public List<Tasks> getAllTasks() {
        return tasks;
    }
}
