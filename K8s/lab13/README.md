# Lab 13
## Persistent Storage Setup for Application Logging
In this lab, we will configure persistent storage in Kubernetes by creating a Persistent Volume (PV) and a Persistent Volume Claim (PVC) to be used for application logging.

## Step 1: Prepare the Node Directory
Since we are using hostPath storage, we must create the directory on the node filesystem

```bash
sudo mkdir -p /mnt/app-logs
sudo chmod 777 /mnt/app-logs
```
![create](https://github.com/EmanElshahat/DevopsTasks/blob/547490d7b83942a022f53b1d12b0fe47061882e7/K8s/lab13/screenshots/p2.png)

## Step 2: Create Persistent Volume (PV)
Create a file named app-logs-pv.yaml:

```bash
vim app-logs-pv.yaml
```
app-logs-pv.yaml:

![create](https://github.com/EmanElshahat/DevopsTasks/blob/547490d7b83942a022f53b1d12b0fe47061882e7/K8s/lab13/screenshots/p3.png)

Apply the PV:

![create](https://github.com/EmanElshahat/DevopsTasks/blob/547490d7b83942a022f53b1d12b0fe47061882e7/K8s/lab13/screenshots/p4.png)


kubectl get pv:

![create](https://github.com/EmanElshahat/DevopsTasks/blob/547490d7b83942a022f53b1d12b0fe47061882e7/K8s/lab13/screenshots/p5.png)
## Step 3: Create Persistent Volume Claim (PVC)
Create a file named app-logs-pvc.yaml:

```bash
vim app-logs-pvc.yaml
```
app-logs-pvc.yaml:

![create](https://github.com/EmanElshahat/DevopsTasks/blob/547490d7b83942a022f53b1d12b0fe47061882e7/K8s/lab13/screenshots/p6.png)

Apply & verify the PVC:

![create](https://github.com/EmanElshahat/DevopsTasks/blob/547490d7b83942a022f53b1d12b0fe47061882e7/K8s/lab13/screenshots/p7.png)

## Summary
- Created a directory on the node for application logs.
- Defined a Persistent Volume (PV) using hostPath storage.
- Configured PV with: 1Gi storage, ReadWriteMany access mode ,Retain reclaim policy
- Created a Persistent Volume Claim (PVC) requesting 1Gi.
- Ensured PVC access mode matches PV.
- Successfully bound PVC to PV.

