FROM openjdk:8
ADD target/docker-springboot-app-1.0.0.jar docker-springboot-app-1.0.0.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar","docker-springboot-app-1.0.0.jar"]