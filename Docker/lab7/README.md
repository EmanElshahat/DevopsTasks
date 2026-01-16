# Lab7
## Docker Volume and Bind Mount with Nginx
In this lab, we will learn how to use Docker Volumes and Bind Mounts with an Nginx container to:

- Persist container logs using Docker volumes
- Serve static HTML content from the host machine using bind mounts

## Step 1: Create Docker Volume for Nginx Logs 
Create a Docker volume to persist Nginx logs:

```bash
docker volume create nginx_logs
```
![creat](https://github.com/EmanElshahat/DevopsTasks/blob/1cd0559ae7030c141d65c0d7a2ba4ea74f309bd2/Docker/lab7/screenshots/p1.png)
## Step 2: Create Bind Mount Directory Structure
Create directories on the host machine to be used as a bind mount:

```bash
mkdir -p nginx-bind/html
```
![creat](https://github.com/EmanElshahat/DevopsTasks/blob/1cd0559ae7030c141d65c0d7a2ba4ea74f309bd2/Docker/lab7/screenshots/p2.png)

## Step 3: Create Custom HTML File
Create an index.html file inside the bind mount directory:

```bash
echo "Hello from Bind Mount” > nginx-bind/html/index.html
cat nginx-bind/html/index.html
```
![index.html](https://github.com/EmanElshahat/DevopsTasks/blob/1cd0559ae7030c141d65c0d7a2ba4ea74f309bd2/Docker/lab7/screenshots/p2.2.png)

## Step 4: Run Nginx Container with Volume and Bind Mount & Verify Nginx Page
Run the Nginx container with:

```bash
docker run -d --name nginx -p 8086:80 -v nginx_logs:/var/log/nginx -v /root/nginx-bind/html:/usr/share/nginx/html nginx
```
Verify the Nginx page using curl from the local machine:

```bash
curl http://localhost:8089
```
![run](https://github.com/EmanElshahat/DevopsTasks/blob/1cd0559ae7030c141d65c0d7a2ba4ea74f309bd2/Docker/lab7/screenshots/p3.png)

## Step 5: Modify HTML File and Verify Again
Edit the index.html file on the host machine:

```bash
echo "hi from updated" > nginx-bind/html/index.html
cat nginx-bind/html/index.html
```
Verify the changes without restarting the container:
```bash
curl http://localhost:8089
```
![modify](https://github.com/EmanElshahat/DevopsTasks/blob/1cd0559ae7030c141d65c0d7a2ba4ea74f309bd2/Docker/lab7/screenshots/p4.png)

## Step 6: Verify Logs in Docker Volume
Check that Nginx logs are stored in the Docker volume:
```bash
docker volume inspect nginx_logs
ls /var/lib/docker/volumes/nginx_logs/_data
```
![logs](https://github.com/EmanElshahat/DevopsTasks/blob/1cd0559ae7030c141d65c0d7a2ba4ea74f309bd2/Docker/lab7/screenshots/p5.png)

## Step 7: Stop Container and Delete Volume
```bash
docker stop nginx
docker rm nginx
docker volume rm nginx_logs
```

![delet](https://github.com/EmanElshahat/DevopsTasks/blob/1cd0559ae7030c141d65c0d7a2ba4ea74f309bd2/Docker/lab7/screenshots/p6.png)

## Summary
- Used Docker Volume to persist Nginx logs.
- Used Bind Mount to serve static HTML files from the host machine.
- Verified that changes in bind-mounted files reflect immediately in the container.
- Confirmed logs persistence using Docker volumes.
- Cleaned up containers and volumes after testing.

