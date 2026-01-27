# Lab 18
## Control Pod-to-Pod Traffic via Network Policy
In this lab, we will control pod-to-pod communication in Kubernetes by creating a NetworkPolicy that allows only the application pods to access the MySQL pods on the MySQL default port.

## Step 1: Verify Namespace and Pod Labels
Make sure all resources are running in the same namespace:
```bash
kubectl get pods -n ivolve --show-labels
```
![verify](https://github.com/EmanElshahat/DevopsTasks/blob/788b97a9e805ae71b48df703ca0fb8a376b06d5f/K8s/lab18/screenshots/1.png)

## Step 2: Create NetworkPolicy
Create a file named `networkpolicy.yaml` 

## Step 3: Apply the NetworkPolicy
```bash
kubectl apply -f networkpolicy.yaml
```
![verify](https://github.com/EmanElshahat/DevopsTasks/blob/788b97a9e805ae71b48df703ca0fb8a376b06d5f/K8s/lab18/screenshots/2.png)

## Step 4: Verify NetworkPolicy
```bash
kubectl get networkpolicy -n ivolve
kubectl describe networkpolicy allow-app-to-mysql -n ivolve
```
![verify](https://github.com/EmanElshahat/DevopsTasks/blob/788b97a9e805ae71b48df703ca0fb8a376b06d5f/K8s/lab18/screenshots/3.png)

## Summary
- Created a NetworkPolicy to control pod-to-pod traffic.
- Targeted MySQL pods using label app=mysql.
- Restricted ingress traffic only (Ingress policy type).
- Allowed access exclusively from Node.js pods labeled app=nodejs.
- Restricted traffic to MySQL default port 3306.
- Successfully verified allowed and denied connections based on the policy.



