package me.elishae.springboot.todolist.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me.elishae.springboot.todolist.dao.TaskDAO;
import me.elishae.springboot.todolist.entity.Task;

@Service
public class TaskServiceImpl implements TaskService {

    // inject DAO class using constructor injection
    private TaskDAO taskDAO;

    public TaskServiceImpl(TaskDAO taskDAO) {
        this.taskDAO = taskDAO;
    }

    @Override
    @Transactional
    public List<Task> getTasks() {
        return taskDAO.getTasks();
    }

    @Override
    @Transactional
    public void saveTask(Task task) {
        taskDAO.saveTask(task);
    }

    @Override
    @Transactional
    public void deleteTask(int id) {
        taskDAO.deleteTask(id);
    }
    
}