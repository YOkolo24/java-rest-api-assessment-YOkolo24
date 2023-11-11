package com.cbfacademy.apiassessment.FileHandler;

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
    
    public static List<Tasks> readFile(String filePath) throws FilenameException {
        List<Tasks> tasks = new ArrayList<>();

        if (!filePath.endsWith(".json"))
            throw new FilenameException("Error - file must be .json file");

        try (FileReader reader = new FileReader(filePath)) {
            List<Tasks> listOfTasks = new Gson().fromJson(reader, new TypeToken<List<Tasks>>() {}.getType());
            if (listOfTasks != null) {
                tasks = listOfTasks;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tasks;
    }

    public static void saveToFile(Tasks tasks, String outputFile) throws FilenameException {
        if (!outputFile.endsWith(".json")) {
            throw new FilenameException("Error - output file must be .json file");
        }
        // HOW WOULD I CHECK IF THERE IS INFORMATION IN THE FILE ALREADY??

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter(outputFile)) {
            gson.toJson(tasks, writer);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
