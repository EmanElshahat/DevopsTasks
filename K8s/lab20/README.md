# Lab 20
## Securing Kubernetes with RBAC and Service Accounts

In this lab, we will configure RBAC (Role-Based Access Control) in Kubernetes by creating a Service Account, a Role with limited permissions, and binding them together using a RoleBinding.

## Step 1: Create Service Account & verify
```bash
kubectl create serviceaccount jenkins-sa -n ivolve
kubectl get sa -n ivolve
```
![create](https://github.com/EmanElshahat/DevopsTasks/blob/1052f681fd9e9fc7b28ad5a45ad725733368e9fd/K8s/lab20/screenshots/1.png)

## Step 2: Retrieve Service Account Token

```bash
kubectl create token jenkins-sa -n ivolve
```
![Token](https://github.com/EmanElshahat/DevopsTasks/blob/1052f681fd9e9fc7b28ad5a45ad725733368e9fd/K8s/lab20/screenshots/2.png)

## Step 3: Define a Role (pod-reader)

Create a file named [pod-reader-role.YAML](pod-reader-role.yaml)

Apply Role:

```bash
kubectl apply -f pod-reader-role.yaml
```
![Apply](https://github.com/EmanElshahat/DevopsTasks/blob/1052f681fd9e9fc7b28ad5a45ad725733368e9fd/K8s/lab20/screenshots/3.png)

## Step 4: Create RoleBinding
Create a file named [jenkins-rolebinding.YAML](jenkins-rolebinding.yaml)

Apply RoleBinding:
![Apply](https://github.com/EmanElshahat/DevopsTasks/blob/1052f681fd9e9fc7b28ad5a45ad725733368e9fd/K8s/lab20/screenshots/4.png)

## Step 5: Validate Permissions
```bash
kubectl auth can-i list pods --as=system:serviceaccount:ivolve:jenkins-sa -n ivolve
```
✅ Should return: yes

```bash
kubectl auth can-i delete pods --as=system:serviceaccount:ivolve:jenkins-sa -n ivolve
```
❌ Should return: no (cannot delete)
![Apply](https://github.com/EmanElshahat/DevopsTasks/blob/1052f681fd9e9fc7b28ad5a45ad725733368e9fd/K8s/lab20/screenshots/5.png)

## Summary
- Created Service Account jenkins-sa[jenkins-sa](jenkins-sa.yaml) in ivolve namespace
- Retrieved associated secret/token
- Created a Role pod-reader with read-only permissions on Pods
- Bound Role to ServiceAccount using RoleBinding `jenkins-pod-reader-binding`
- Validated that jenkins-sa can only list/get Pods but cannot perform write operations





