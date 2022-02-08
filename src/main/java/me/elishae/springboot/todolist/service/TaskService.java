package me.elishae.springboot.todolist.service;

import java.util.List;

import org.springframework.stereotype.Service;

import me.elishae.springboot.todolist.entity.Task;

// the service layer is not necessary in such a simple app
// but for completeness and extensibility I will add it
// it will simply redirect the the equivalent DAO methods

public interface TaskService {
    
    // get a list of all task
    public List<Task> getTasks();

    // save a task
    public void saveTask(Task task);

    // delete task
    public void deleteTask(int id);

}