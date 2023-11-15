package com.cbfacademy.apiassessment;

// import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// import com.cbfacademy.apiassessment.FileHandler.FilenameException;
// import com.cbfacademy.apiassessment.FileHandler.JSONFileHandler;
// import com.cbfacademy.apiassessment.tasks.Tasks;

@SpringBootApplication
//@RestController
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);

    //     String filePath = "src//main//resources//tasklist.json";

    //     readFile(filePath);
    //     saveToFile(filePath);
	// }

    // private static void readFile(String readFilePath) {
    //     try {
    //         List<Tasks> listOfTasks = JSONFileHandler.readFile(readFilePath);
    //         System.out.println(listOfTasks.toString());
    //     } catch (FilenameException e) {
    //         System.err.println("Filename Exception: " + e.getMessage());
    //     }
    // }

    // private static void saveToFile(Tasks tasks, String filePath) {
    //     try {
    //         JSONFileHandler.save(tasks, filePath);
    //     } catch (FilenameException e) {
    //         System.out.println("Filename Exception: " + e.getMessage());
    //     }
    }
    
    // Test endpoint
// 	@GetMapping("/greeting")
// 	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
// 		return String.format("Hello %s", name);
// 	}

}
