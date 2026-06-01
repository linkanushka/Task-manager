package org.example.task_management_system.controller;
import org.example.task_management_system.entity.Task;
import org.example.task_management_system.service.TaskService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private final TaskService taskService;
    public TaskController(TaskService taskService){
        this.taskService=taskService;
    }
    @GetMapping
    public List<Task>getAllTasks(){
        return taskService.getAllTasks();
    }
    @PostMapping
    public Task createTask(@RequestBody Task task){
        return taskService.saveTask(task);
    }
    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
        return "Task deleted successfully";
    }
}
