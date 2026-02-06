# Lab 25
## GitOps Workflow with ArgoCD & Jenkins Pipeline
In this lab, we will create a GitOps workflow using Jenkins for CI/CD and ArgoCD for deployment on a Kubernetes cluster. The pipeline automates building, pushing Docker images, updating manifests, and ArgoCD deployment.

## Prerequisites
1. Kubernetes Cluster running and accessible.
2. Jenkins Server with pipeline and shared library configured.
3. Docker Hub Account to push Docker images.
4. kubectl configured to access the cluster.
5. ArgoCD installed in the cluster:

## Step 1: Create Repository 

`https://github.com/EmanElshahat/Jenkins_App_Pipeline.git`

## Step 2: Configure Jenkins Pipeline

## Step 3: Pipeline Stages


## Step 4: ArgoCD Configuration
1. Install ArgoCD in Kubernetes cluster:
   
```bash
kubectl apply -n argocd -f https://raw.githubusercontent.com/argoproj/argo-cd/stable/manifests/install.yaml
```
2. Create an application in ArgoCD:
- App Name: jenkins-app
- Project: default
- Repository URL: https://github.com/<your-username>/lab25-gitops.git
- Path: . (root of repo)
- Cluster: https://kubernetes.default.svc
- Namespace: ivolve
  
![create](https://github.com/EmanElshahat/DevopsTasks/blob/547490d7b83942a022f53b1d12b0fe47061882e7/K8s/lab13/screenshots/p1.png)
3. Click Sync in ArgoCD UI to deploy the app.

![create](https://github.com/EmanElshahat/DevopsTasks/blob/547490d7b83942a022f53b1d12b0fe47061882e7/K8s/lab13/screenshots/p1.png)

## Step 5: Validate Deployment


