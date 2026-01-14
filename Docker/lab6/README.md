# Lab6
## Managing Docker Environment Variables Across Build and Runtime
In this lab, we will learn how to manage environment variables in Docker at different stages:
At runtime using command line
Using an environment file
Inside the Dockerfile itself

---

## Step 1: Clone the Application Code

Clone the source code from GitHub:

```bash
git clone https://github.com/Ibrahim-Adel15/Docker-3.git
cd Docker-3
```
![Repository Cloned](https://github.com/EmanElshahat/DevopsTasks/blob/23cb2eba17b3098a15fd9759b57b5fa04ba8b7dd/Docker/lab6/screenshots/p1.png)

## Step 2: Write Dockerfile

Create a Dockerfile:
```bash
vim Dockerfile
```
Dockerfile:

![dockerfile](https://github.com/EmanElshahat/DevopsTasks/blob/23cb2eba17b3098a15fd9759b57b5fa04ba8b7dd/Docker/lab6/screenshots/p2.png)

## Step 3: Build Docker Image
Build the Docker image:
```bash
docker build -t lab6 .
```
![bulid](https://github.com/EmanElshahat/DevopsTasks/blob/23cb2eba17b3098a15fd9759b57b5fa04ba8b7dd/Docker/lab6/screenshots/p3.png)

## Step 4: Run Container with Environment Variables from Command Line & Test
(development, us-east)
```bash
docker run -d --name con4 -p 8070:8080 -e APP_MODE=development -e APP_REGION=us-east lab6
curl localhost:8070
```
![run](https://github.com/EmanElshahat/DevopsTasks/blob/23cb2eba17b3098a15fd9759b57b5fa04ba8b7dd/Docker/lab6/screenshots/p4.png)

## Step 5: Creat env file:
Create an environment file:
```bash
vim env
```
env file:
![env](https://github.com/EmanElshahat/DevopsTasks/blob/23cb2eba17b3098a15fd9759b57b5fa04ba8b7dd/Docker/lab6/screenshots/p5.png)
## Step 6: Run the container using the env file & Test:
```bash
docker run -d --name con5 -p 8071:8080 --env-file=env lab6
curl localhost:8071
```
![run](https://github.com/EmanElshahat/DevopsTasks/blob/23cb2eba17b3098a15fd9759b57b5fa04ba8b7dd/Docker/lab6/screenshots/p6.png)
## Step 7:Write Dockerfile2 with Environment Variables: 
Create a Dockerfile2:
```bash
vim Dockerfile2
```
Dockerfile2 file:
![dockerfile2](https://github.com/EmanElshahat/DevopsTasks/blob/23cb2eba17b3098a15fd9759b57b5fa04ba8b7dd/Docker/lab6/screenshots/p7.png)
## Step 8: Build Docker Image 2:

```bash
docker build -f Dockerfile2 -t lab6-2 .
```
![bulid](https://github.com/EmanElshahat/DevopsTasks/blob/23cb2eba17b3098a15fd9759b57b5fa04ba8b7dd/Docker/lab6/screenshots/p8.png)
## Step 9: Run the container using the env file & Test:
```bash
docker run -d --name con6 -p 8072:8080 lab6-2
curl localhost:8072
```
![run](https://github.com/EmanElshahat/DevopsTasks/blob/23cb2eba17b3098a15fd9759b57b5fa04ba8b7dd/Docker/lab6/screenshots/p9.png)

## Summary
- Learned how to manage Docker environment variables in three ways:
- Passing variables at runtime using -e
- Using an environment file with --env-file
- Defining variables inside the Dockerfile using ENV
- Built a Python Flask application inside a Docker container.
- Ran multiple containers from the same image with different configurations.
Tested, stopped, and removed all containers successfully.

