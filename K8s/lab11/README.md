# Lab11
## Namespace Management and Resource Quota Enforcement
In this lab, we will learn how to manage Kubernetes namespaces and enforce resource quotas to limit the number of pods in a namespace.

## Step 1: Create a Namespace
Create a namespace called ivolve:

```bash
kubectl create ns ivolve
```
![create]

## Step 2: Apply a Resource Quota
Create a ResourceQuota YAML file (quota.yaml) to limit the number of pods to 2:
```bash

```
![quotafile]

Apply the ResourceQuota:
```bash
kubectl apply -f quota.yaml
```
![apply]

## Step 3: Verify the Resource Quota
Check the applied quotas in the namespace:
```bash
kubectl get resourcequota -n ivolve
```
![verify]

## Step 4: Test the Pod Limit
Try creating 3 pods in the ivolve namespace:
- The first 2 pods will be created successfully.

```bash
kubectl run pod1 --image=nginx -n ivolve
kubectl run pod2 --image=nginx -n ivolve
```
![succesfully]
- The 3rd pod will fail with an error:

```bash
kubectl run pod3 --image=nginx -n ivolve
```

![fail]

## Summary
- Created a namespace ivolve in Kubernetes.
- Applied a ResourceQuota to limit the number of pods to 2.
- Verified the quota using kubectl get and kubectl describe.
- Demonstrated that creating more pods than allowed fails.
