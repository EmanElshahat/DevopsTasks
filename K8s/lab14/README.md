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

```yaml
apiVersion: v1
kind: Service
metadata:
  name: mysql
spec:
  clusterIP: None
  selector:
    app: mysql
  ports:
    - port: 3306
      name: mysql
```
Apply:
```bash
kubectl apply -f mysql-headless-svc.yaml
```

## Step 3: Create StatefulSet with PVC
File: `mysql-statefulset.yaml`

```yaml
apiVersion: apps/v1
kind: StatefulSet
metadata:
  name: mysql
spec:
  serviceName: mysql
  replicas: 1
  selector:
    matchLabels:
      app: mysql
  template:
    metadata:
      labels:
        app: mysql
    spec:
      tolerations:
        - key: "node"
          operator: "Equal"
          value: "worker"
          effect: "NoSchedule"
      containers:
        - name: mysql
          image: mysql:5.7
          ports:
            - containerPort: 3306
          env:
            - name: MYSQL_ROOT_PASSWORD
              valueFrom:
                secretKeyRef:
                  name: mysql-secret
                  key: MYSQL_ROOT_PASSWORD
          volumeMounts:
            - name: mysql-data
              mountPath: /var/lib/mysql
  volumeClaimTemplates:
    - metadata:
        name: mysql-data
      spec:
        accessModes:
          - ReadWriteOnce
        storageClassName: standard
        resources:
          requests:
            storage: 1Gi
```

Apply:

```bash
kubectl apply -f mysql-statefulset.yaml
```
## Step 4: Verify StatefulSet and Pods
```bash
kubectl get statefulset
kubectl get pods
```

## Step 5: Verify PVC Creation
```bash
kubectl get pvc
```
## Step 6: Test MySQL Connectivity
```bash
kubectl exec -it mysql-0 -- mysql -u root -p
```
## Summary
- Created a Secret for MySQL root password.
- Deployed MySQL using a StatefulSet with 1 replica.
- Used PVC for persistent database storage.
- Added toleration for node taint node=worker:NoSchedule.
- Created a Headless Service for stable DNS.
- Successfully connected to MySQL using a client pod.

