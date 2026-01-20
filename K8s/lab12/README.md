# Lab12
## Managing Configuration and Sensitive Data with ConfigMaps and Secrets
In this lab, we will learn how to manage application configuration and sensitive data in Kubernetes using ConfigMaps and Secrets.

## Step 1: Create ConfigMap for MySQL Configuration
We will create a ConfigMap to store non-sensitive MySQL configuration variables:

```bash
kubectl create cm ivolve-cm -n ivolve --from-literal=DB_HOST=db --from-literal=DB_USER=appuser --dry-run=client -o yaml
```
![create](https://github.com/EmanElshahat/DevopsTasks/blob/c7f26f4ec4691a6f80d7f4a82ba46bf7af8ebc44/K8s/lab12/screenshots/p1.png)

Apply the ConfigMap:
```bash
kubectl apply -f ivolve-cm.yaml
```
![create](https://github.com/EmanElshahat/DevopsTasks/blob/c7f26f4ec4691a6f80d7f4a82ba46bf7af8ebc44/K8s/lab12/screenshots/p2.png)

Verify the ConfigMap:
```bash
kubectl get configmap -n ivolve
```
![create](https://github.com/EmanElshahat/DevopsTasks/blob/c7f26f4ec4691a6f80d7f4a82ba46bf7af8ebc44/K8s/lab12/screenshots/p3.png)

## Step 2: Encode Sensitive Data Using Base64
We need to store sensitive credentials in a Secret. Kubernetes requires Base64 encoding.
```bash
echo -n "ivolve_password" | base64
```
![create](https://github.com/EmanElshahat/DevopsTasks/blob/00b3649f447f0b1a243d1f189ea730ffc4cb3c99/K8s/lab12/screenshots/Screenshot%202026-01-20%20045733.png)

## Step 3: Create Secret for MySQL Credentials
Sensitive data to store:
```bash
kubectl create secret generic  ivolve-s -n ivolve --from-literal=DB_PASSWORD=pass123 --from-literal=MYSQL_ROOT_PASSWORD=pass123 --dry-run=client -o yaml
```
![create](https://github.com/EmanElshahat/DevopsTasks/blob/c7f26f4ec4691a6f80d7f4a82ba46bf7af8ebc44/K8s/lab12/screenshots/p4.png)

Apply & verify the Secret:
```bash
kubectl apply -f ivolve-s.yaml
kubectl get secret -n ivolve
```
![create](https://github.com/EmanElshahat/DevopsTasks/blob/c7f26f4ec4691a6f80d7f4a82ba46bf7af8ebc44/K8s/lab12/screenshots/p5.png)


## Summary
- Created a ConfigMap to store non-sensitive MySQL configuration.
- Created a Secret to securely store sensitive MySQL credentials.
- Used Base64 encoding for Secret data values.
- Verified ConfigMap and Secret creation using kubectl.
