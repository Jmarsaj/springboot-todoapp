# ToDo App
This is a practice Todo App created to familiarise myself with Kotlin and Springboot for the backend, and HTML with Thymeleaf and Bootstrap for the frontend

# Initializing and Setting Up the Environment
- Install jdk 17 from https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html <br>
- Install java and kotlin IDE intellij from https://www.jetbrains.com/idea/ <br>
- Install sql IDE DataGrip from https://www.jetbrains.com/datagrip/download/#section=windows <br>
- Install Insomnia for debugging and testing Api's from https://insomnia.rest/ <br>
- Install postgresql from https://www.postgresql.org/download/ <br>
<br>
<br>
- Initialize springboot from https://start.spring.io/; and select the following options: <br><br>

<img src="img/Annotation 2023-06-26 184357.png" width="50%" height="50%">

- And add the following dependencies: <br>

<img src="img/Annotation 2023-06-26 184907.png" width="50%" height="50%">
<br>
- Generate and extract the files  <br>
- Then open the extracted folder in IntelliJ

# Plugins
Install the following plugins in IntelliJ editor for easier editing: <br>
In Files > Settings > Plugins:
- Install Database Navigator plugin
- Install JPA Buddy Navigator plugin

# Database
The pgadmin GUI should be automatically included when installing Postegresql <br>
To see the table in pgadmin (after running the springboot application),
- Go to springboot-todoapp > Schemas > Tables
- Right click todo_entity > View/Edit Data > All Rows
