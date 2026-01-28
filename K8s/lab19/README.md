# Lab 19
## Node-Wide Pod Management with DaemonSet

In this lab, we will deploy a DaemonSet in Kubernetes to run Prometheus node-exporter on every node in the cluster. This ensures that monitoring metrics are collected from all nodes.

## Step 1: Create Monitoring Namespace & verify

```bash
kubectl create namespace monitoring
kubectl get ns
```
![create](https://github.com/EmanElshahat/DevopsTasks/blob/fdb584382d791658e2b66a20cf8582aba38c7e7f/K8s/lab19/screenshots/1.png)

## Step 2: Create DaemonSet YAML
Create a file named[ node-exporter-daemonset.YAML](node-exporter-daemonset.yaml)

## Step 3: Apply DaemonSet 
```bash
kubectl apply -f node-exporter-daemonset.yaml
```
Verify DaemonSet:

```bash
kubectl get daemonset -n monitoring
```
![Apply](https://github.com/EmanElshahat/DevopsTasks/blob/fdb584382d791658e2b66a20cf8582aba38c7e7f/K8s/lab19/screenshots/2.png)

## Step 4: Verify Pods on Each Node
```bash
kubectl get pods -n monitoring -o wide
```
![Verify](https://github.com/EmanElshahat/DevopsTasks/blob/fdb584382d791658e2b66a20cf8582aba38c7e7f/K8s/lab19/screenshots/3.png)

## Step 5: Confirm Metrics Exposure
from host using NodePort/hostPort (9100):
```bash
curl http://192.168.49.2:9100/metrics
```
![Confirm](https://github.com/EmanElshahat/DevopsTasks/blob/fdb584382d791658e2b66a20cf8582aba38c7e7f/K8s/lab19/screenshots/4.png)

## Summary
- Created monitoring namespace
- Deployed DaemonSet for node-exporter
- Tolerations configured to allow scheduling on all tainted nodes
- Verified that one pod per node is running
- Confirmed metrics are exposed on port 9100
