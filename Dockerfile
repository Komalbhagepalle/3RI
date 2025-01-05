FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/welcome-app-1.0.jar welcome-app.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "welcome-app.jar"]

