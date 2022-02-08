package me.elishae.springboot.todolist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import me.elishae.springboot.todolist.entity.Task;
import me.elishae.springboot.todolist.service.TaskService;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/")
public class TaskController {
    
    @Autowired
    private TaskService taskService;

    @GetMapping("/")
    public ModelAndView showTasks() {
        
        // define mav
        ModelAndView mav = new ModelAndView();

        // get tasks from service 
        List<Task> tasks = taskService.getTasks();

        // populate mav
        mav.addObject("tasks", tasks);
        mav.addObject("task", new Task());
        mav.setViewName("index");

        // return mav
        return mav;

    }

    @PostMapping(value="/new-task")
    public ModelAndView createNewTask(@ModelAttribute("task") Task newTask) {

        // define mav and populate with sample task
        ModelAndView mav = new ModelAndView();
        mav.addObject("task", new Task());

        // save the employee
        taskService.saveTask(newTask);

        // redirect to homepage 
        mav.setViewName("redirect:/");
        
        return mav;
    }
    
}