# ${artifactId}

${applicationDescription}  

## Getting Started (delete section once complete)

1. Create the hipchat room if it does not already exist
2. Check port in src/main/resources/application.properties . If changing port, update customMessage in jenkinsfile.
3. Remove skips from each stage definition once environment is ready
4. If a war deploying to tomcat is preferred
    1. Follow this guide: https://spring.io/guides/gs/spring-boot/
    1. change artifact ext to war
    1. add `dest_path: ''`  in the artifact section with path to the tomcat deployment directory


### App includes
1. Controller
2. Simple api that returns version of the app 
3. Test for that simple api



## Building App
`mvn clean install` if using maven
`gradle clean build` if using gradle


## How to Run  
This spring boot app is an executable
`./target/${artifactId}` if using maven 
`./build/lib/${artifactId}` if using gradle


## Getting Help
* Learn the Spring basics -- Spring Boot builds on many other Spring projects, check
  the https://spring.io[spring.io] web-site for a wealth of reference documentation. If
  you are just starting out with Spring, try one of the https://spring.io/guides[guides].
* Reach out in your team room in hipchat 

## Reporting Issues
* If there's an issue with jenkins, find the tool-talk room in hipchat 

## Guides
https://spring.io/guides/gs/spring-boot/[Building an Application with Spring Boot] is a
  very basic guide that shows you how to create a simple application, run it and add some
  management services.
https://spring.io/guides/gs/convert-jar-to-war/[Converting a Spring Boot JAR Application
  to a WAR] shows you how to run applications in a web server as a WAR file.

