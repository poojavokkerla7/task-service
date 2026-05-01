package com.example.taskservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskRepository repo;

    @PostMapping
    public Task addTask(@RequestBody @Valid Task task) {
        return repo.save(task);
    }

    @GetMapping
    public List<Task> getTasks() {
        return repo.findAll();
    }
}