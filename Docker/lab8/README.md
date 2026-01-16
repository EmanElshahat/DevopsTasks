# Lab8
## Custom Docker Network for Microservices
In this lab, we will learn how to create and use a custom Docker network to enable communication between microservices containers (frontend & backend), and compare it with the default Docker network behavior.

## Step 1: Clone Frontend and Backend Code
Clone the application source code from GitHub:
```bash
git clone https://github.com/Ibrahim-Adel15/Docker5.git
cd Docker5
```
![Repository Cloned](https://github.com/EmanElshahat/DevopsTasks/blob/3d23f53120eb971eaf9f745a7eaddf115e8ed1f4/Docker/lab8/screenshots/P1.png)

## Step 2: Write Dockerfile for Frontend

```bash
cd frontend
vim Dockerfile
```
![front](https://github.com/EmanElshahat/DevopsTasks/blob/3d23f53120eb971eaf9f745a7eaddf115e8ed1f4/Docker/lab8/screenshots/P2.png)

Frontend Dockerfile:
![dockerfile](https://github.com/EmanElshahat/DevopsTasks/blob/3d23f53120eb971eaf9f745a7eaddf115e8ed1f4/Docker/lab8/screenshots/P3.png)

## Step 3: Build Frontend Image
Build the frontend Docker image:

```bash
docker build -t front-im .
```
![buildfront](https://github.com/EmanElshahat/DevopsTasks/blob/3d23f53120eb971eaf9f745a7eaddf115e8ed1f4/Docker/lab8/screenshots/P4.png)

## Step 4: Write Dockerfile for Backend

```bash
cd ../backend
vim Dockerfile
```
![back](https://github.com/EmanElshahat/DevopsTasks/blob/3d23f53120eb971eaf9f745a7eaddf115e8ed1f4/Docker/lab8/screenshots/P5.png)

Backend Dockerfile:
![dockerfile](https://github.com/EmanElshahat/DevopsTasks/blob/3d23f53120eb971eaf9f745a7eaddf115e8ed1f4/Docker/lab8/screenshots/P6.png)

## Step 5: Build Backend Image
Build the backend Docker image:
```bash
docker build -t back-im .
```
![baclbulid](https://github.com/EmanElshahat/DevopsTasks/blob/3d23f53120eb971eaf9f745a7eaddf115e8ed1f4/Docker/lab8/screenshots/P7.png)

## Step 6: Create Custom Docker Network
Create a new custom Docker network called ivolve-network:
```bash
docker network create ivolve-network
```
![network](https://github.com/EmanElshahat/DevopsTasks/blob/3d23f53120eb971eaf9f745a7eaddf115e8ed1f4/Docker/lab8/screenshots/P8.png)

## Step 7: Run Backend Container Using Custom Network
Run the backend container attached to ivolve-network:
```bash
docker run -d --name back --network ivolve-network back-im
```
![run](https://github.com/EmanElshahat/DevopsTasks/blob/3d23f53120eb971eaf9f745a7eaddf115e8ed1f4/Docker/lab8/screenshots/P9.png)

## Step 8: Run Frontend Container
Run the first frontend container using the same custom network:

```bash
docker run -d --name front1 --network ivolve-network -p 5001:500 front-im
```
![run](https://github.com/EmanElshahat/DevopsTasks/blob/3d23f53120eb971eaf9f745a7eaddf115e8ed1f4/Docker/lab8/screenshots/P10.png)

Run a second frontend container using the default bridge network:

```bash
docker run -d --name front2 -p 5002:500 front-im
```
![run](https://github.com/EmanElshahat/DevopsTasks/blob/3d23f53120eb971eaf9f745a7eaddf115e8ed1f4/Docker/lab8/screenshots/P11.png)

## Step 9: Verify Communication Between Containers
frontend1 can communicate with backend using the container name:

```bash
docker exec -it front1 sh
curl http://back:5000
```
![verify](https://github.com/EmanElshahat/DevopsTasks/blob/3d23f53120eb971eaf9f745a7eaddf115e8ed1f4/Docker/lab8/screenshots/P12.png)

frontend2 cannot communicate with backend using container name:

```bash
docker exec -it front2 sh
curl http://back:5000
```
![verify](https://github.com/EmanElshahat/DevopsTasks/blob/3d23f53120eb971eaf9f745a7eaddf115e8ed1f4/Docker/lab8/screenshots/P13.png)

## Step 10: Delete Custom Docker Network
Stop and remove containers
```bash
docker stop front1 front2 back
docker rm front1 front2 back
```

then Delete the custom Docker network:
```bash
docker network rm ivolve-network
```
![delete](https://github.com/EmanElshahat/DevopsTasks/blob/3d23f53120eb971eaf9f745a7eaddf115e8ed1f4/Docker/lab8/screenshots/P14.png)

## Summary
- Created separate Docker images for frontend and backend services.
- Used a custom Docker network to enable service-to-service communication.
- Verified that containers on the same custom network can communicate using container names.
- Observed that containers on the default network cannot communicate the same way.
- Cleaned up containers and deleted the custom network.
