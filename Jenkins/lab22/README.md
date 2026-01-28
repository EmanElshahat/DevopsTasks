# Lab 22
## Jenkins Pipeline for Application Deployment
In this lab, we will create a Jenkins Pipeline that automates the full CI/CD process for deploying a Java application to a Kubernetes cluster using Docker.
## Step 1: Clone Source Code
Clone the application source code and Dockerfile from GitHub:
```bash
git clone https://github.com/EmanElshahat/Jenkins_App_Pipeline.git
cd Jenkins_App_Pipeline
```

## Step 2: Prepare Jenkinsfile
 `Jenkinfiمe` is included in the repo.
 
Docker Hub credential ID: docker-hub

[Jenkinsfile](Jenkinsfile)
## Step 3: Deployment YAML

[deployment.YAML](deployment.yaml) is included in the repo as a template.

## Step 4: Configure Jenkins Pipeline
- Go to Jenkins → New Item → Pipeline 
- Pipeline → Definition → Pipeline script from SCM
- SCM → Git → Repository URL: https://github.com/EmanElshahat/Jenkins_App_Pipeline.git
- Branch → */main
- Script Path → Jenkinsfile
  
## Step 5: Pipeline Execution

![create](https://github.com/EmanElshahat/DevopsTasks/blob/547490d7b83942a022f53b1d12b0fe47061882e7/K8s/lab13/screenshots/p1.png)

## Summary
- Created a full CI/CD pipeline in Jenkins.
- Automated Maven build, Docker image build/push, deployment.yaml update, and Kubernetes deployment.
- Used environment variables for image name and build number.
- Post actions ensure messages are printed based on the build result.



