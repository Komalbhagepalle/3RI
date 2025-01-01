FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/welcome-app-1.0.jar welcome-app.jar

EXPOSE 8081

CMD ["java", "-jar", "welcome-app.jar"]

