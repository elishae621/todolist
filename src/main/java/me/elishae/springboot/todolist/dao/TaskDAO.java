package me.elishae.springboot.todolist.dao;

import me.elishae.springboot.todolist.entity.Task;

import java.util.List;

public interface TaskDAO {
    
    // get a list of all task 
    public List<Task> getTasks();

    // save a task 
    public void saveTask(Task task);

    // delete task
    public void deleteTask(int id);
}