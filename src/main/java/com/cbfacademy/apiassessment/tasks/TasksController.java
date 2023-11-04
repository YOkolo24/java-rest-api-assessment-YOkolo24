package com.cbfacademy.apiassessment.tasks;

import java.util.ArrayList;
import java.util.List;
//import java.util.Comparator;

import org.springframework.web.bind.annotation.*; 

@RestController
@RequestMapping("/tasks")
public class TasksController {
    
    private final List<Tasks> tasks = new ArrayList<>();

    @GetMapping(value = "/tasks", produces = "List of active tasks")
    public List<Tasks> getAllTasks() {
        return Arrays.asList();
    }
}
