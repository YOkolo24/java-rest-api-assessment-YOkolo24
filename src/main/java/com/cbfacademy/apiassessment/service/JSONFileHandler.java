package com.cbfacademy.apiassessment.service;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.cbfacademy.apiassessment.tasks.Tasks;
import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JSONFileHandler {

    // String filePath = "src//main//resources//tasklist.json";
    
    // public static List<Tasks> readFile(String filePath) throws FilenameException {
    //     List<Tasks> tasks = new ArrayList<>();

    //     if (!filePath.endsWith(".json"))
    //         throw new FilenameException("Error - file must be .json file");

    //     try (FileReader reader = new FileReader(filePath)) {
    //         List<Tasks> listOfTasks = new Gson().fromJson(reader, new TypeToken<List<Tasks>>() {}.getType());
    //         if (listOfTasks != null) {
    //             tasks = listOfTasks;
    //         }
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    //     return tasks;
    // }

    // public static void saveToFile(Tasks tasks, String filePath) throws FilenameException {
    //     if (!filePath.endsWith(".json")) {
    //         throw new FilenameException("Error - output file must be .json file");
    //     }
    //     if (readFile(filePath) != null) {

    //         Gson gson = new GsonBuilder().setPrettyPrinting().create();

    //         try (FileWriter writer = new FileWriter(filePath, true)) { 
    //             gson.toJson(tasks, writer);
    //         }    

    //     }   
        
    //         // HOW WOULD I CHECK IF THERE IS INFORMATION IN THE FILE ALREADY??
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }

    }

}
