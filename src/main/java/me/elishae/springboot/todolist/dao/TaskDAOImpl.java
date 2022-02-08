package me.elishae.springboot.todolist.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import me.elishae.springboot.todolist.entity.Task;

//  this is the standard JPA implementation

@Repository
public class TaskDAOImpl implements TaskDAO {

    private EntityManager entityManager;

    // inject entityManager
    @Autowired
    public TaskDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Task> getTasks() {

        // create a query 
        TypedQuery<Task> taskQuery = entityManager.createQuery("from Task", Task.class);

        // execute query and get result list 
        List<Task> tasks = taskQuery.getResultList();

        // return the tasks
        return tasks;

    }

    @Override
    public void saveTask(Task task) {
        
        // save or update the employee
        Task dbTask = entityManager.merge(task);

        // update with id from db ...
        // so we can get generated id for save/insert
        task.setId(dbTask.getId());
    }

    @Override
    public void deleteTask(int id) {

        // delete object with primary key 
        Query query = entityManager.createQuery("delete from Task where id=:taskId");

        // set the query parameter
        query.setParameter("taskId", "id");

        // execute query 
        query.executeUpdate();
    }
    
}