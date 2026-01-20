# Lab11
## Namespace Management and Resource Quota Enforcement
In this lab, we will learn how to manage Kubernetes namespaces and enforce resource quotas to limit the number of pods in a namespace.

## Step 1: Create a Namespace
Create a namespace called ivolve:

```bash
kubectl create ns ivolve
```
![create](https://github.com/EmanElshahat/DevopsTasks/blob/67265892148410266bad3ea922afb04fe55d6e79/K8s/lab11/screenshots/p1.png)

## Step 2: Apply a Resource Quota
Create a ResourceQuota YAML file (quota.yaml) to limit the number of pods to 2:
```bash
kubectl create quota pop-test --hard=pops=2 -n ivovle --dry-run=client -o yaml

```
![quotafile](https://github.com/EmanElshahat/DevopsTasks/blob/67265892148410266bad3ea922afb04fe55d6e79/K8s/lab11/screenshots/p2.png)


## Step 3: Apply the Resource Quota & Verify the Resource Quota
Check the applied quotas in the namespace:
```bash
kubectl apply -f quota.yaml
kubectl get resourcequota -n ivolve
```
![verify](https://github.com/EmanElshahat/DevopsTasks/blob/67265892148410266bad3ea922afb04fe55d6e79/K8s/lab11/screenshots/p3.png)


## Step 4: Test the Pod Limit
Try creating 3 pods in the ivolve namespace:
- The first 2 pods will be created successfully.

```bash
kubectl run pod1 --image=nginx -n ivolve
kubectl run pod2 --image=nginx -n ivolve
```
![succesfully](https://github.com/EmanElshahat/DevopsTasks/blob/67265892148410266bad3ea922afb04fe55d6e79/K8s/lab11/screenshots/p4.png)

- The 3rd pod will fail with an error:

```bash
kubectl run pod3 --image=nginx -n ivolve
```

![fail](https://github.com/EmanElshahat/DevopsTasks/blob/67265892148410266bad3ea922afb04fe55d6e79/K8s/lab11/screenshots/p5.png)


## Summary
- Created a namespace ivolve in Kubernetes.
- Applied a ResourceQuota to limit the number of pods to 2.
- Verified the quota using kubectl get and kubectl describe.
- Demonstrated that creating more pods than allowed fails.
