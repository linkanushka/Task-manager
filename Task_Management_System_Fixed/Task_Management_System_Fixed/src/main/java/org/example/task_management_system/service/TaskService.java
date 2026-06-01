package org.example.task_management_system.service;
import org.example.task_management_system.entity.Task;
import org.example.task_management_system.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskService {
    private final TaskRepository taskRepository;
    public TaskService(TaskRepository taskRepository){
        this.taskRepository=taskRepository;
    }
    public List<Task>getAllTasks(){
        return taskRepository.findAll();
    }
    public Task saveTask(Task task){
        return taskRepository.save(task);

    }
    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }
}
