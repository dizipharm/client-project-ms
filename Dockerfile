FROM openjdk:17
EXPOSE 8080
ADD target/client-project-ms.jar client-project-ms.jar
ENTRYPOINT ["java","-jar","/client-project-ms.jar"]
