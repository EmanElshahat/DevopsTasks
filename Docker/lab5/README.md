# Lab5
## Multi-Stage Build for a Node.js / Java App

In this lab, we will learn how to build a Java Spring Boot application using a multi-stage Docker build to reduce image size and optimize the container.

---

## Step 1: Clone the Application Code

Clone the source code from GitHub:

```bash
git clone https://github.com/Ibrahim-Adel15/Docker-1.git
cd Docker-1
```
![Repository Cloned](https://github.com/EmanElshahat/DevopsTasks/blob/fc4c57ca020fc11177c4fe24955c10c2b9a80e6a/Docker/lab5/screenshots/p1.png)

## Step 2: Write Multi-Stage Dockerfile

Create a Dockerfile using multi-stage build:
```bash
vim Dockerfile
```
Dockerfile:

![dockerfile](https://github.com/EmanElshahat/DevopsTasks/blob/fc4c57ca020fc11177c4fe24955c10c2b9a80e6a/Docker/lab5/screenshots/p2.png)

## Step 3: Build Docker Image
Build the Docker image:
```bash
docker build -t lab5 .
```
![bulid](https://github.com/EmanElshahat/DevopsTasks/blob/fc4c57ca020fc11177c4fe24955c10c2b9a80e6a/Docker/lab5/screenshots/p3.png)

## Step 4: Run the Docker Container
Run a container from the lab5 image:
```bash
docker run -d --name con3 -p 8099:8080 lab5

```
![run](https://github.com/EmanElshahat/DevopsTasks/blob/fc4c57ca020fc11177c4fe24955c10c2b9a80e6a/Docker/lab5/screenshots/p4.png)

## Step 6: Test the Application
Test the application using browser or curl:
```bash
curl http://localhost:8099
```
![test](https://github.com/EmanElshahat/DevopsTasks/blob/fc4c57ca020fc11177c4fe24955c10c2b9a80e6a/Docker/lab5/screenshots/p5.png)
## Step 7: Stop and Delete the Container
Stop and remove the container:

```bash
docker stop con3
docker rm con3
```
![Delete-stop](https://github.com/EmanElshahat/DevopsTasks/blob/fc4c57ca020fc11177c4fe24955c10c2b9a80e6a/Docker/lab5/screenshots/p6.png)

## Summary
- Multi-stage Docker build helps reduce image size by separating build and runtime stages.
- Clone the application source code.
- Write a multi-stage Dockerfile using Maven for build and Java runtime for execution.
- Build the Docker image and check the image size.
- Run a container from the image.
- Test the application.
- Stop and delete the container.
- Stop and delete the container.

