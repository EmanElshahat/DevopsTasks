# Lab10
## Node Isolation Using Taints in Kubernetes
In this lab, we will learn how to use Kubernetes Taints to isolate nodes and control pod scheduling by preventing pods from being scheduled on specific nodes.

## Step 1: Run Kubernetes Cluster with Two Nodes
```bash
minikube start --nodes=2
kubectl get nodes
```
![node=2](https://github.com/EmanElshahat/DevopsTasks/blob/0e6a9f1a93c2b6cf417e48c294340654a1be8a60/K8s/lab10/screenshots/p1.png)

![node=2](https://github.com/EmanElshahat/DevopsTasks/blob/0e6a9f1a93c2b6cf417e48c294340654a1be8a60/K8s/lab10/screenshots/p2.png)

## Step 2: Taint One Node
```bash
kubectl taint nodes minikube-m02 node=worker:NoSchedule
```
![taint](https://github.com/EmanElshahat/DevopsTasks/blob/0e6a9f1a93c2b6cf417e48c294340654a1be8a60/K8s/lab10/screenshots/p3.png)

## Step 3: Describe All Nodes
Describe all nodes to verify their configurations:
```bash
kubectl describe node minikube | grep Taint
kubectl describe node minikube-m02 | grep Taint
```
![taint](https://github.com/EmanElshahat/DevopsTasks/blob/0e6a9f1a93c2b6cf417e48c294340654a1be8a60/K8s/lab10/screenshots/p4.png)

## Summary
- Created a Kubernetes cluster with two nodes.
- Applied a taint to a node to prevent pod scheduling.
- Verified the taint using kubectl describe nodes.
- Learned how taints are used for node isolation and scheduling control.

## Key Notes
- NoSchedule: Prevents new pods from being scheduled unless they tolerate the taint.
- Taints are used on nodes, while tolerations are applied to pods.
- Taints help isolate workloads and protect specific nodes.
