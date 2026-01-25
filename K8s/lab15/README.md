# Lab 15
## Node.js Application Deployment with ClusterIP Service
In this lab, we deploy a Node.js application on Kubernetes using a Deployment and expose it internally using a ClusterIP Service.

# Prerequisites 
- Docker image pushed to Docker Hub : emanabosamra/kubernets-app:latest .
- ConfigMap `ivolve-cm` , Secret `ivolve-s` and Persistent Volume (PV) `app-logs-pvc` already exist.

## Step 1: Create Deployment
Create file `deployment.yaml` : 
```bash
vim deployment.yaml
```
Apply:

```bash
kubectl apply -f deployment.yaml
```
## Step 2: Verify Deployment & Pods
```bash
kubectl get deployment -n ivolve
kubectl get pods -n ivolve
```
![create](https://github.com/EmanElshahat/DevopsTasks/blob/fe778f2e17e284ca4580498a1931e14d7e5f1c7f/K8s/lab15/screenshots/Screenshot%202026-01-25%20035203.png)

## Step 3: Create ClusterIP Service
Create file `service.yaml` :
```bash
vim service.yaml
```
Apply:

```bash
kubectl apply -f service.yaml
```
## Step 4: Verify Service
```bash
kubectl get svc nodejs-service -n ivolve
```
![create](https://github.com/EmanElshahat/DevopsTasks/blob/fe778f2e17e284ca4580498a1931e14d7e5f1c7f/K8s/lab15/screenshots/Screenshot%202026-01-25%20035539.png)

## Summary

- Created a Deployment with 2 replicas.
- Used a custom Node.js image from Docker Hub.
- Injected environment variables from ConfigMap & Secret.
- Added toleration for node=worker:NoSchedule.
- Mounted a static Persistent Volume.
- Created a ClusterIP Service to balance traffic.
- Verified application accessibility.


