# Use an official OpenJDK runtime as a parent image
FROM openjdk:18-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/otus-kbalakin.jar /app/otus-kbalakin.jar

# Make port available to the world outside this container
EXPOSE 8000

# Run the application
ENTRYPOINT ["java", "-jar", "otus-kbalakin.jar"]
