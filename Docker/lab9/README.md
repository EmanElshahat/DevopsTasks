# Lab9
## Containerized Node.js and MySQL Stack Using Docker Compose

In this lab, we will learn how to containerize a Node.js application with MySQL using Docker Compose, manage environment variables, persist database data using volumes, and verify application health and logs.

## Step 1: Clone the Application Source Code
Clone the application source code from GitHub:
```bash
git clone https://github.com/Ibrahim-Adel15/kubernets-app.git
cd kubernets-app
```
![Repository Cloned](https://github.com/EmanElshahat/DevopsTasks/blob/955a19903b3e68dba376e020fa61db6b4ada1961/Docker/lab9/screenshots/p1.png)

## Step 2: Create docker-compose.yml File
Create the Docker Compose file:
```bash
vim docker-compose.yml
```
Docker compose file:
![dockercompose](https://github.com/EmanElshahat/DevopsTasks/blob/955a19903b3e68dba376e020fa61db6b4ada1961/Docker/lab9/screenshots/p2.png)

## Step 3: Build and Run the Stack
Build and start the application and database services:
```bash
docker compose up -d
```
![build](https://github.com/EmanElshahat/DevopsTasks/blob/955a19903b3e68dba376e020fa61db6b4ada1961/Docker/lab9/screenshots/p3.png)

## Step 4: Verify Application is Working
Test the application using curl :
```bash
curl http://localhost:3001

```
![test](https://github.com/EmanElshahat/DevopsTasks/blob/955a19903b3e68dba376e020fa61db6b4ada1961/Docker/lab9/screenshots/p4.png)

## Step 5: Verify Health Endpoints
```bash
curl http://localhost:3001/health
curl http://localhost:3001/ready

```
Health:

![health](https://github.com/EmanElshahat/DevopsTasks/blob/955a19903b3e68dba376e020fa61db6b4ada1961/Docker/lab9/screenshots/p5.png)

Ready:

![ready](https://github.com/EmanElshahat/DevopsTasks/blob/955a19903b3e68dba376e020fa61db6b4ada1961/Docker/lab9/screenshots/p6.png)

## Step 6: Verify Application Logs
Verify application access logs inside the container:
```bash
docker logs web-app
```

![logs](https://github.com/EmanElshahat/DevopsTasks/blob/955a19903b3e68dba376e020fa61db6b4ada1961/Docker/lab9/screenshots/p7.png)

## Step 7: Push Docker Image to DockerHub
Push the Image:
```bash
docker tag kubernets-app-app emanabosamra/kubernets-app:latest
docker push emanabosamra/kubernets-app:latest
```

![push](https://github.com/EmanElshahat/DevopsTasks/blob/955a19903b3e68dba376e020fa61db6b4ada1961/Docker/lab9/screenshots/p8.png)


## Summary
- Used Docker Compose to run a Node.js and MySQL stack.
- Configured environment variables for database connectivity.
- Persisted MySQL data using Docker volumes.
- Verified application functionality, health, readiness, and logs.
- Built and pushed the application image to DockerHub.
