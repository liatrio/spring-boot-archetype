
## How to Generate a New Project

1. Open a terminal window and navigate to the directory where you want to store this project. The following Maven 
command will create a project directory as a child of the directory where you run the commands. 
2. Edit if necessary and run this example Maven command to generate the new project.
    ```
    mvn archetype:generate \
        -DarchetypeGroupId=liatrio.archetypes \
        -DarchetypeArtifactId=spring-boot \
        -DarchetypeVersion=2.1.2 \
        -DarchetypeRepository=https://artifactory.liatr.io/artifactory/maven-release/
    ```
3. Answer the prompts and use the defaults when possible
4. Create an empty repository
5. Follow instructions from new repo under _My code is ready to be pushed_
6. Create the hipchat room if it does not already exist

