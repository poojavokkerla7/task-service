package com.example.taskservice;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private List<String> tasks = new ArrayList<>();

    @PostMapping
    public String addTask(@RequestBody String task) {
        tasks.add(task);
        return "Task Added";
    }

    @GetMapping
    public List<String> getTasks() {
        return tasks;
    }
}