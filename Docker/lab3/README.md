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
![Repository Cloned](https://github.com/EmanElshahat/DevopsTasks/blob/5d42a56943e9a0c908fe92d616e16105a24d2ba5/Docker/lab3/screenshots/p1.png)
## Step 2: Write Dockerfile

Create a Dockerfile for the Spring Boot application:

```bash
vim Dockerfile
```
![Write-Docker](https://github.com/EmanElshahat/DevopsTasks/blob/5d42a56943e9a0c908fe92d616e16105a24d2ba5/Docker/lab3/screenshots/p2.png)

Dockerfile:
![Dockerfile](https://github.com/EmanElshahat/DevopsTasks/blob/5d42a56943e9a0c908fe92d616e16105a24d2ba5/Docker/lab3/screenshots/p3.png)

## Step 3: Build the Docker Image
Build the Docker image:

```bash
docker build -t lab3 .
```
![build](https://github.com/EmanElshahat/DevopsTasks/blob/5d42a56943e9a0c908fe92d616e16105a24d2ba5/Docker/lab3/screenshots/p4.png)

## Step 4: Run the Docker Container
Run a container from the image:
```bash
docker run -d --name con1 -p 8090:8080 lab3 .
```
![Run](https://github.com/EmanElshahat/DevopsTasks/blob/5d42a56943e9a0c908fe92d616e16105a24d2ba5/Docker/lab3/screenshots/p5.png)

## Step 5: Test the Application
Test the application by opening your browser or using curl:
```bash
curl localhost:8090
```
![Test](https://github.com/EmanElshahat/DevopsTasks/blob/5d42a56943e9a0c908fe92d616e16105a24d2ba5/Docker/lab3/screenshots/p6.png)

## Step 6: Stop and Delete the Container
Stop and remove the container:
```bash
docker stop con1
docker rm con1
```
![Delete-stop](https://github.com/EmanElshahat/DevopsTasks/blob/5d42a56943e9a0c908fe92d616e16105a24d2ba5/Docker/lab3/screenshots/p7.png)
## Summary

- The full workflow of running a Java Spring Boot application in Docker:
- Clone the repository from GitHub.
- Write a Dockerfile with Maven and Java 17.
- Build the application inside the container using Maven.
- -Expose port 8090.
- Build the Docker image and run a container from it.
- Test the application to ensure it works.
- Stop and delete the container when done .
