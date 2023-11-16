package com.cbfacademy.apiassessment.service;

import com.cbfacademy.apiassessment.tasks.Tasks;

public interface TasksService {
   
    ResponsesModel createTask(Tasks tasks);

    ResponsesModel getAllTasks();

    ResponsesModel getTaskById(Integer id);

    ResponsesModel updateTask(Tasks tasks);

    ResponsesModel deleteTask(Integer id);
    
}
