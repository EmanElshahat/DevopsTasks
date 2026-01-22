# Lab 14
## StatefulSet with Headless Service (MySQL)
In this lab, we deploy a MySQL database using a StatefulSet with persistent storage and a Headless Service for stable network identity.

## Step 1: Create Secret for MySQL Root Password
```bash
kubectl create secret generic mysql-secret \
  --from-literal=MYSQL_ROOT_PASSWORD=rootpass456
````

Check:

```bash
kubectl get secret mysql-secret
```
## Step 2: Create Headless Service
File: `mysql-headless-svc.yaml`
