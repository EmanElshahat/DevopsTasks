# Lab 24
## Multi-Branch CI/CD Workflow with Jenkins
In this lab, we will create a Multi-Branch Jenkins Pipeline that automates CI/CD for deploying a Java application to a Kubernetes cluster using Docker. Each Git branch (dev, stag, prod) will deploy to a separate Kubernetes namespace using a Shared Library for reusable steps.

## Step 1: Create Shared Library
Created a private GitHub repository for the shared library:
`https://github.com/EmanElshahat/jenkins-shared-lib.git`

## Step 2: Configure Shared Library in Jenkins
 [Jenkinsfile](Jenkinsfile)

## Step 3: Clone Application Repository
```bash
git clone https://github.com/EmanElshahat/Jenkins_App_Pipeline.git
cd Jenkins_App_Pipeline
```

## Step 4: Create Git Branches
Create three branches for each environment:
```bash
git checkout -b dev
git push -u origin dev

git checkout -b stag
git push -u origin stag

git checkout -b prod
git push -u origin prod
```

## Step 5: Create Kubernetes Namespaces
Create namespaces matching each branch:
```bash
kubectl create namespace dev
kubectl create namespace stag
kubectl create namespace prod
```

## Step 6: Configure Jenkins Multibranch Pipeline
1. New Item → Multibranch Pipeline
2. Source → Git → Repository URL: https://github.com/EmanElshahat/Jenkins_App_Pipeline.git
3. Branch Sources → Discover all branches (dev, stag, prod)
4. Script Path → Jenkinsfile
![create](https://github.com/EmanElshahat/DevopsTasks/blob/08bc24ef5d8e47632a757f0db9756cb4b106c466/Jenkins/lab24/screenshots/Screenshot%202026-02-08%20021114.png)


## Step 8: Execute Pipeline
Make changes and push to any branch:
```bash
git checkout dev
git commit -am "Test deploy dev"
git push
```

## Summary
- Created a Multi-Branch CI/CD pipeline in Jenkins using a Shared Library.
- Each Git branch (dev, stag, prod) deploys to a separate Kubernetes namespace.
- Automated Maven build, Docker image build/push, and Kubernetes deployment.
- Automated Maven build, Docker image build/push, and Kubernetes deployment.
- Shared Library enables reusable steps across multiple branches/pipelines.
- Jenkins Multibranch Pipeline automatically detects branches and triggers the appropriate pipeline.
