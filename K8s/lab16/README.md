# Lab 16
## Kubernetes Init Container for Pre-Deployment Database Setup
In this lab, we configure a Kubernetes Init Container to prepare the database before the main Node.js application starts.
The init container connects to MySQL, creates the ivolve database, and creates a user with full privileges on that database.

## Prerequisites
- Kubernetes cluster running
- MySQL already deployed (StatefulSet or Deployment)
- ConfigMap and Secret created:
  ConfigMap: `mysql-config `
  Secret: `mysql-secret`
- Namespace: `ivolve`

## Step 1: Verify ConfigMap and Secret
Check that the required ConfigMap and Secret exist:

```bash
kubectl get cm -n ivolve
kubectl get secret -n ivolve
```

![create](https://github.com/EmanElshahat/DevopsTasks/blob/356cb5bb863d6e3ad2d7d95dffe6cb837da509ef/K8s/lab16/screenshots/3.png)

## Step 2: Modify Node.js Deployment to Add Init Container
Edit the existing Node.js Deployment and add an init container.
`deployment.yaml`

## Step 3: Apply the Updated Deployment
Apply the deployment changes:
```bash
kubectl apply -f deployment.yaml
kubectl get pods -n ivolve
```

![create](https://github.com/EmanElshahat/DevopsTasks/blob/d04efe716c2ff7042568432c6b2dbcc098d54dd2/K8s/lab16/screenshots/1.png)

## Step 4: Manually Verify Database and User
Connect to the MySQL pod:

```bash
kubectl exec -it mysql-0 -n ivolve -- mysql -u ivolve_user -p
```
Inside MySQL shell:

```bash
SHOW DATABASES;
```
![create](https://github.com/EmanElshahat/DevopsTasks/blob/d04efe716c2ff7042568432c6b2dbcc098d54dd2/K8s/lab16/screenshots/2.png)
## Summary
- Added an init container to prepare the database before application startup
- Used MySQL client image for database initialization
- Passed DB credentials securely using ConfigMap and Secret
- Verified database and user creation manually
- Ensured application starts only after DB is ready



