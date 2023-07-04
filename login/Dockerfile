# Use the base image with Java and the necessary tools installed
FROM openjdk:17

# Set the working directory in the container
WORKDIR /app

# Copy the application JAR file to the container
COPY target/myOrderManagement-0.0.1-SNAPSHOT.jar .

# Set the command to run when the container starts
CMD ["java", "-jar", "myOrderManagement-0.0.1-SNAPSHOT.jar"]
