# Lab 17
## Pod Resource Management with CPU and Memory Requests and Limits
The goal of this lab is to configure CPU and memory resource requests and limits for a Node.js application running on Kubernetes, then verify and monitor the applied resources.
## 🛠️ Lab Requirements
Update the existing Node.js Deployment to include the following resource configuration:

Resource Requests
- CPU: 1 vCPU
- Memory: 1Gi
Resource Limits
- CPU: 2 vCPUs
- Memory: 2Gi
## Step 1: Update the Node.js Deployment
Edit the existing ذnodejs-appذ Deployment and add CPU and memory requests and limits to the container specification.
`deployment.yaml`

## Step 2: Apply the Deployment
Apply the updated deployment YAML file.

```bash
kubectl apply -f deployment.yaml
```
![create](https://github.com/EmanElshahat/DevopsTasks/blob/8f09bf71f97b1a8230406619202f4d865b91a330/K8s/lab17/screenshots/Screenshot%202026-01-27%20163805.png)

## Step 3: Verify Pod Status
Ensure the pods are running successfully.
```bash
kubectl get pods -n ivolve
```
## Step 4: Verify Resource Requests and Limits
Describe the pod to confirm CPU and memory settings are applied.
Ensure the pods are running successfully.
```bash
kubectl describe pod mysql-5c684dc7d4-4fzxx -n ivolve
```

## Step 5: Monitor Real-Time Resource Usage
Monitor CPU and memory usage of the pod.
```bash
kubectl top pod -n ivolve
```
![create](https://github.com/EmanElshahat/DevopsTasks/blob/8f09bf71f97b1a8230406619202f4d865b91a330/K8s/lab17/screenshots/Screenshot%202026-01-27%20174439.png)
## sumaary
In this lab, we learned how to:
- Configure CPU and memory requests and limits for Kubernetes Pods
- Understand the difference between resource requests and limits
- Verify resource configuration using kubectl describe
- Monitor real-time resource usage using kubectl top
Proper resource management is essential for maintaining cluster stability and ensuring optimal application performance.
