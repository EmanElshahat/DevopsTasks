# Lab4
## Run Java Spring Boot App in a Container (Using JAR)

In this lab, we will learn how to run a Java Spring Boot application inside a Docker container by copying the built JAR file into the image, then building and running the container.

---

## Step 1: Clone the Application Code

Clone the source code from GitHub:

```bash
git clone https://github.com/Ibrahim-Adel15/Docker-1.git
cd Docker-1
```
![Repository Cloned](https://github.com/EmanElshahat/DevopsTasks/blob/5d42a56943e9a0c908fe92d616e16105a24d2ba5/Docker/lab3/screenshots/p1.png)
## Step 2: Build the Application

Build the Spring Boot application and generate the JAR file:

```bash
mvn package
```
![Write-Docker](https://github.com/EmanElshahat/DevopsTasks/blob/5d42a56943e9a0c908fe92d616e16105a24d2ba5/Docker/lab3/screenshots/p2.png)

The JAR file will be generated at:
![Dockerfile](https://github.com/EmanElshahat/DevopsTasks/blob/5d42a56943e9a0c908fe92d616e16105a24d2ba5/Docker/lab3/screenshots/p3.png)

## Step 3: Write Dockerfile
Create a Dockerfile using Java 17 base image:

```bash
vim Dockerfile
```
Dockerfile:
![build](https://github.com/EmanElshahat/DevopsTasks/blob/5d42a56943e9a0c908fe92d616e16105a24d2ba5/Docker/lab3/screenshots/p4.png)

## Step 4: Build Docker Image
Build the Docker image:
```bash
docker build -t lab4 .
```
![Run](https://github.com/EmanElshahat/DevopsTasks/blob/5d42a56943e9a0c908fe92d616e16105a24d2ba5/Docker/lab3/screenshots/p5.png)

## Step 5: Run the Docker Container
Run a container from the lab4 image:
```bash
docker run -d --name con2 -p 8092:8080 lab4

```
![Test](https://github.com/EmanElshahat/DevopsTasks/blob/5d42a56943e9a0c908fe92d616e16105a24d2ba5/Docker/lab3/screenshots/p6.png)

## Step 6: Test the Application
Test the application using browser or curl:
```bash
curl http://localhost:8092
```
![Delete-stop.(https://github.com/EmanElshahat/DevopsTasks/blob/5d42a56943e9a0c908fe92d616e16105a24d2ba5/Docker/lab3/screenshots/p7.png)
## Step 7: Stop and Delete the Container
Stop and remove the container:

```bash
docker stop con2
docker rm con2
```
![Delete-stop](https://github.com/EmanElshahat/DevopsTasks/blob/5d42a56943e9a0c908fe92d616e16105a24d2ba5/Docker/lab3/screenshots/p7.png)

## Summary
- The full workflow of running a Java Spring Boot application in Docker using a JAR file:
- Clone the application source code.
- Build the application to generate the JAR file.
- Write a Dockerfile using Java 17 base image.
- Copy the JAR file into the container and expose port 8080.
- Build the Docker image and check the image size.
- Run a container from the image.
- Test the application.
- Stop and delete the container.
