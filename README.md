# ToDo App
This is a practice Todo App created to familiarise myself with Kotlin and Springboot

# Initializing and Setting Up the Environment
- Install jdk 17 from https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html <br>
- Install java and kotlin IDE intellij from https://www.jetbrains.com/idea/ <br>
- Install sql IDE DataGrip from https://www.jetbrains.com/datagrip/download/#section=windows <br>
- Install Insomnia for debugging and testing Api's from https://insomnia.rest/ <br>
- Install postgresql from https://www.postgresql.org/download/ <br>
<br>
<br>
- Initialize springboot from https://start.spring.io/; and select the following options: <br>

<img src="https://github.com/Jmarsaj/springboot-todoapp/assets/80609678/49d9b84f-6e73-4b7d-80eb-1320903263ef" width="50%" height="50%">

- And add the following dependencies: <br>

<img src="https://github.com/Jmarsaj/springboot-todoapp/assets/80609678/83b7bde8-41ba-402e-bd94-b91ed7199528" width="50%" height="50%">
<br>
<br>
- Generate and extract the files  <br>
- Then open the extracted folder in IntelliJ

# Plugins
Install the following plugins in IntelliJ editor for easier editing: <br>
In Files > Settings > Plugins:
- Install Database Navigator plugin
- Install JPA Buddy Navigator plugin

#Database
The pgadmin GUI should be automatically included when installing Postegresql <br>
To see the table in pgadmin (after running the springboot application),
- Go to springboot-todoapp > Schemas > Tables
- Right click todo_entity > View/Edit Data > All Rows
