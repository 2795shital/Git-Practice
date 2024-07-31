# Use an OpenJDK base image
FROM openjdk:11

# Set the working directory inside the container
WORKDIR /app

# Copy the Java source code file into the Docker image
COPY HelloWorld.java /app

# Compile the Java program
RUN javac HelloWorld.java

# Set the command to run your Java program when the container starts
CMD ["java", "HelloWorld"]
