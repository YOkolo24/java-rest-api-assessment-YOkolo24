package com.cbfacademy.apiassessment.tasks;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*; 

@RestController
@RequestMapping("/tasks")
public class TasksController {
    
    private final List<Tasks> tasks = new ArrayList<>();

    @GetMapping(value = "/")
    public List<Tasks> getAllTasks() {
        return tasks;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Tasks> getTaskById(@PathVariable Long id) {
        for (Tasks task : tasks) {
            if (task.getId().equals(id)) {
                return ResponseEntity.ok(task);
            }
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    @PostMapping(value = "/")
    public Tasks createTasks(@RequestBody Tasks task) {
        tasks.add(task);

        return task;

    }
}
