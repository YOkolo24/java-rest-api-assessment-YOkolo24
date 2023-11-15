package com.cbfacademy.apiassessment.service;

import com.cbfacademy.apiassessment.tasks.ResponsesModel;
import com.cbfacademy.apiassessment.tasks.Tasks;

public interface TasksService {
   
    ResponsesModel createTask(Tasks tasks);
    
}
