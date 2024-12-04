FROM openjdk:21
EXPOSE 9394
ADD target/github-action.jar github-action.jar
ENTRYPOINT ["java","-jar","/github-action.jar"]