# Lab 19
## Node-Wide Pod Management with DaemonSet

In this lab, we will deploy a DaemonSet in Kubernetes to run Prometheus node-exporter on every node in the cluster. This ensures that monitoring metrics are collected from all nodes.

## Step 1: Create Monitoring Namespace & verify

```bash
kubectl create namespace monitoring
kubectl get ns
```
![create](https://github.com/EmanElshahat/DevopsTasks/blob/547490d7b83942a022f53b1d12b0fe47061882e7/K8s/lab13/screenshots/p1.png)

## Step 2: Create DaemonSet YAML
Create a file named node-exporter-daemonset.yaml

## Step 3: Apply DaemonSet 
```bash
kubectl apply -f node-exporter-daemonset.yaml
```
Verify DaemonSet:

```bash
kubectl get daemonset -n monitoring
```
![create](https://github.com/EmanElshahat/DevopsTasks/blob/547490d7b83942a022f53b1d12b0fe47061882e7/K8s/lab13/screenshots/p1.png)

## Step 4: Verify Pods on Each Node
```bash
kubectl get pods -n monitoring -o wide
```
![create](https://github.com/EmanElshahat/DevopsTasks/blob/547490d7b83942a022f53b1d12b0fe47061882e7/K8s/lab13/screenshots/p1.png)

## Step 5: Confirm Metrics Exposure
from host using NodePort/hostPort (9100):
```bash
curl http://192.168.49.2:9100/metrics
```
![create](https://github.com/EmanElshahat/DevopsTasks/blob/547490d7b83942a022f53b1d12b0fe47061882e7/K8s/lab13/screenshots/p1.png)

## Summary
- Created monitoring namespace
- Deployed DaemonSet for node-exporter
- Tolerations configured to allow scheduling on all tainted nodes
- Verified that one pod per node is running
- Confirmed metrics are exposed on port 9100
