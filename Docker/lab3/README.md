# Lab3
## Run Java Spring Boot App in a Container

In this lab, we will learn how to run a Java Spring Boot application inside a Docker container, build the image, run the container, and test the application.

---

## Step 1: Clone the Application Code

Clone the source code from GitHub:

```bash
git clone https://github.com/Ibrahim-Adel15/Docker-1.git
cd Docker-1
```

## Step 2: Write Dockerfile

Create a Dockerfile for the Spring Boot application:

```bash
vim Dockerfile
```
Dockerfile:

## Step 3: Build the Docker Image
Build the Docker image:

```bash
docker build -t lab3 .
```

## Step 4: Run the Docker Container
Run a container from the image:
```bash
docker run -d --name con1 -p 8090:8080 lab3
```
## Step 5: Test the Application
Test the application by opening your browser or using curl:
```bash
curl localhost:8090
```

## Step 6: Stop and Delete the Container
Stop and remove the container:
```bash
docker stop con1
docker rm con1
```

## Summary

- The full workflow of running a Java Spring Boot application in Docker:
- Clone the repository from GitHub.
- Write a Dockerfile with Maven and Java 17.
- Build the application inside the container using Maven.
- -Expose port 8090.
- Build the Docker image and run a container from it.
- Test the application to ensure it works.
- Stop and delete the container when done.
