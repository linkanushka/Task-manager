package org.example.task_management_system.repository;
import org.example.task_management_system.entity.Task;

import org.springframework.data.jpa.repository.JpaRepository;



public interface TaskRepository extends JpaRepository<Task,Long> {

}
