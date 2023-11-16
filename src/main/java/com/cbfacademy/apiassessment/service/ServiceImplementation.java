package com.cbfacademy.apiassessment.service;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cbfacademy.apiassessment.tasks.Tasks;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Service
public class ServiceImplementation implements TasksService {

    @Override
    public ResponsesModel createTask(Tasks tasks) {
        
        ResponsesModel responsesModel = new ResponsesModel();

        List<Tasks> tasksData = readJsonFile();
        Tasks taskPresent = null;

        if(tasksData != null) 
            taskPresent = tasksData.parallelStream().filter(emp -> emp.getId().equals(tasks.getId())).findAny().orElse(null);
        else 
            tasksData = new ArrayList<>();

        if(taskPresent == null) {
            tasksData.add(tasks);

            boolean status = writeToJsonFile(tasksData);

            if (status) {
                responsesModel.setStatus(Responses.success);
                responsesModel.setData(Responses.taskAdded);
            }
        }
        else {
            responsesModel.setData(Responses.taskAlreadyPresent);
        }

        return responsesModel;
    }
    
    public List<Tasks> readJsonFile() {
        List<Tasks> tasks = new ArrayList<>();

        try {
            String json = Files.readString(Path.of("tasklist.json"));
            tasks = new Gson().fromJson(json, new TypeToken<List<Tasks>>() {}.getType());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tasks;
    }

    public boolean writeToJsonFile(List<Tasks> taskData) {

        boolean status = false;

        try (FileWriter writer = new FileWriter("tasklist.json")) {
            writer.write(new Gson().toJson(taskData));
            writer.flush();

            status = true;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return status;
    }

    @Override
    public ResponsesModel getAllTasks() {
        
        ResponsesModel responsesModel = new ResponsesModel();
        
        List<Tasks> tasksData = readJsonFile();
        responsesModel.setStatus(Responses.success);
        responsesModel.setData(tasksData);

        return responsesModel;
    }

    @Override
    public ResponsesModel getTaskById(Integer id) {
       ResponsesModel responsesModel = new ResponsesModel();

       List<Tasks> tasksData = readJsonFile();
       Tasks tasks = tasksData.parallelStream().filter(emp -> emp.getId().equals(id)).findAny().orElse(null);

       if(tasks != null) {
        responsesModel.setStatus(Responses.success);
        responsesModel.setData(tasks);
       }
       else {
        responsesModel.setStatus(Responses.success);
        responsesModel.setData(Responses.taskNotFound);
       }
       return responsesModel;
    }

    @Override
    public ResponsesModel updateTask(Tasks tasks) {
       ResponsesModel responsesModel = new ResponsesModel();

       List<Tasks> tasksData = readJsonFile();
       tasksData.removeIf(emp -> emp.getId().equals(tasks.getId()));
       tasksData.add(tasks);

       boolean status = writeToJsonFile(tasksData);

       if(status) {
        responsesModel.setStatus(Responses.success);
        responsesModel.setData(Responses.taskDetailsUpdated);
       }
       return responsesModel;
    }
    

    @Override
    public ResponsesModel deleteTask(Integer id) {
        ResponsesModel responsesModel = new ResponsesModel();

       List<Tasks> tasksData = readJsonFile();
       tasksData.removeIf(emp -> emp.getId().equals(id));

       boolean status = writeToJsonFile(tasksData);

       if(status) {
        responsesModel.setStatus(Responses.success);
        responsesModel.setData(Responses.taskDeleted);
       }
       return responsesModel;
    }
    
}

