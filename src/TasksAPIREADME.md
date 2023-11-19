# **Tasks REST-API 📝**

## **Introduction**
Due to my love for all things organised, I've created a very simple 'Tasks' REST-API utilising Java and SpringBoot. 

Through this API you can create tasks, read all the tasks added, update tasks, and delete tasks. There are also some simple searches you can complete - such as finding a task by it's ID or by it's priority score. This API acts as a basic foundation upon which an even more complex Tasks REST-API can be built. Further additions added to the present code can add other useful functions for the API.

---

## Getting Started

- [Prerequisites](#prerequisites)

- [Setup](#setup)

### Prerequisites

Before you begin, make sure you have the following installed:

1. [JDK 17](https://learn.microsoft.com/en-gb/java/openjdk/download#openjdk-17) (or higher)

2. [Git](https://git-scm.com/downloads)

3. [Visual Studio Code](https://code.visualstudio.com/Download)
   1. [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
   2. [Spring Boot Extension Pack](https://marketplace.visualstudio.com/items?itemName=vmware.vscode-boot-dev-pack)

4. [POSTMAN](https://www.postman.com/downloads/) (download for your desktop or use the web version. A short video on the use of POSTMAN can be found [here](https://www.youtube.com/watch?v=E0f9DUEN_jI))

Also make sure you have accounts for the following:

1. [GitHub](https://github.com/signup)

### Setup

#### 1. Clone the Repository

```sh
git clone [REPO_URL]
cd [REPO_NAME]
```

Replace [REPO_URL] with the link to your GitHub repository and [REPO_NAME] with the repository's name.

#### 2. Install Dependencies

Open a terminal at the root of the repo directory and run the following command to install the dependencies:

```sh
./mvnw clean dependency:resolve
```

If you are on a Windows machine, that will be:
```cmd
mvnw clean dependency:resolve
```

You should see console output similar to the following:

```sh
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------< com.cbfacademy:api-assessment >--------------------
[INFO] Building api-assessment 0.0.1-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.2.0:clean (default-clean) @ api-assessment ---
[INFO] Deleting /Users/user/Dev/cbfacademy/java-api-assessment/target
...
[truncated output]
...
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.060 s
[INFO] Finished at: 2023-10-03T16:18:25+01:00
[INFO] ------------------------------------------------------------------------
```

#### 3. Running the Application

To start the API in VS Code, press `F5` or tap the 'Play' icon for the `api-assessment` app in the Spring Boot Dashboard.

Alternatively, to start the API from the terminal, run the following command:

```sh
./mvnw spring-boot:run
```

Or on Windows:

```cmd
mvnw spring-boot:run
```

You should see console output similar to the following (press `Ctrl + C` to exit):

```sh
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------< com.cbfacademy:api-assessment >--------------------
[INFO] Building api-assessment 0.0.1-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.2.0:clean (default-clean) @ api-assessment ---
[INFO] Deleting /Users/gary/Dev/cbfacademy/java-api-assessment/target
[INFO] 
[INFO] >>> spring-boot:3.1.4:run (default-cli) > test-compile @ api-assessment >>>
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ api-assessment ---
[INFO] Copying 1 resource from src/main/resources to target/classes
[INFO] Copying 0 resource from src/main/resources to target/classes
...
[truncated output]
...
2023-10-03T17:17:34.413+01:00  INFO 35536 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2023-10-03T17:17:34.751+01:00  INFO 35536 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2023-10-03T17:17:34.756+01:00  INFO 35536 --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-10-03T17:17:34.756+01:00  INFO 35536 --- [  restartedMain] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.13]
2023-10-03T17:17:34.777+01:00  INFO 35536 --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-10-03T17:17:34.778+01:00  INFO 35536 --- [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 364 ms
2023-10-03T17:17:34.898+01:00  INFO 35536 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2023-10-03T17:17:34.907+01:00  INFO 35536 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2023-10-03T17:17:34.911+01:00  INFO 35536 --- [  restartedMain] com.cbfacademy.apiassessment.App         : Started App in 0.643 seconds (process running for 0.786)
```

Open and use POSTMAN to test out the API by first opening a tab, choosing the required method, and entering `http://localhost:8080`, with the required endpoint (see below for more details on this). You can also open your browser and navigate to `http://localhost:8080` and test some of the endpoints from here.


## **API Endpoints**

In this REST-API, the methods (request types) have been leveraged to support basic CRUD (**Create**, **Read**, **Update**, and **Delete**) operations. This API also utilises [Gson](https://github.com/google/gson) to manipulate JSON. Below are the various methods and endpoints implemented into the API and the expected responses:

#### Create a new task: Method = POST, endpoint = '/tasks/'
This method and end point will allow you to create a new task with an ID, details of the task, a priority score out of 5 and answer whether the task is completed or not (true or false). The API will return a status message of 'success' and a data response confirming the task has been added successfully. If a task is added with and ID that has already been used, the task won't be created and the API will return a 'fail' status and let you know the task ID is already present.

#### Display all active tasks: Method = GET, endpoint = '/tasks/all'
This method and end point will display all active tasks in the API. The API will return a status message of 'success' and list of all the details of the tasks present in the API.

#### Get a specific task by its ID: Method = GET, endpoint = '/tasks/{id}'
This method and end point will allow you to display the details of a task with a specific ID. The API will give a status message of 'success' if the ID specified is found, and display details of the task requested. If an ID is requested that isn't present, the API will return a 'fail' status and let you know the task hasn't been found.

#### Get a specific task by its priority score: Method = GET, endpoint = '/tasks/priority/{priorityScoreOutOfFive}'
This method and end point will allow you to display the details of a task with a specific priority score. The API will give a status message of 'success' if the priority score specified is found, and display details of the task requested. If a priority score is requested that isn't present, the API will return a 'fail' status and let you know the task with that priority score hasn't been found.

#### Update the details of a specific task by its ID: Method = PUT, endpoint = '/tasks/{id}'
This method and end point will allow you to update the details of a task with a specific ID. The API will give a status message of 'success' if the ID specified is found, and display details of the task requested with the updated information included.

#### Update the details of a specific task by its ID: Method = DELETE, endpoint = '/tasks/{id}'
This method and end point will allow you to delete the details of a task with a specific ID. The API will give a status message of 'success' if the ID specified is found, and a data response confirming the task has been deleted successfully.