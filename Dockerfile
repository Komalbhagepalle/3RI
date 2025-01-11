# Use an OpenJDK base image
FROM openjdk:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy the jar file into the container
COPY target/hello-world-0.0.1-SNAPSHOT.jar app.jar

# Specify the entry point
ENTRYPOINT ["java", "-jar", "app.jar"]
