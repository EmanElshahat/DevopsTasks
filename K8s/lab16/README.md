# Lab 16
## Kubernetes Init Container for Pre-Deployment Database Setup
In this lab, we configure a Kubernetes Init Container to prepare the database before the main Node.js application starts.
The init container connects to MySQL, creates the ivolve database, and creates a user with full privileges on that database.

## Prerequisites
- Kubernetes cluster running
- MySQL already deployed (StatefulSet or Deployment)
- ConfigMap and Secret created:
  ConfigMap: `ivolve-cm`
  Secret: `ivolve-s`
- Namespace: `ivolve`

## Step 1: Verify ConfigMap and Secret
Check that the required ConfigMap and Secret exist:

```bash
kubectl get cm -n ivolve
kubectl get secret -n ivolve
```

![create](https://github.com/EmanElshahat/DevopsTasks/blob/e55b9d80b52cc9d891af87ae7c2c12d82b4f9aba/K8s/lab16/screenshots/Screenshot%202026-01-26%20010818.png)

## Step 2: Modify Node.js Deployment to Add Init Container
Edit the existing Node.js Deployment and add an init container.
`deployment.yaml`

## Step 3: Apply the Updated Deployment
Apply the deployment changes:
```bash
kubectl apply -f deployment.yaml
kubectl get pods -n ivolve
```

![create](https://github.com/EmanElshahat/DevopsTasks/blob/e55b9d80b52cc9d891af87ae7c2c12d82b4f9aba/K8s/lab16/screenshots/Screenshot%202026-01-26%20011904.png)

## Step 4:Manually Verify Database and User
Connect to the MySQL pod:

```bash
kubectl exec -it <mysql-pod-name> -n ivolve -- mysql -u root -p
```
Inside MySQL shell:

```bash
SHOW DATABASES;
USE ivolve;
SHOW GRANTS FOR 'appuser'@'%';
```
## Summary
- Added an init container to prepare the database before application startup
- Used MySQL client image for database initialization
- Passed DB credentials securely using ConfigMap and Secret
- Verified database and user creation manually
- Ensured application starts only after DB is ready



