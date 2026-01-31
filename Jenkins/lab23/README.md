# Lab 23
## CI/CD Pipeline Implementation with Jenkins Agents and Shared Libraries
In this lab, we will create a Jenkins Pipeline that automates the CI/CD process for deploying a Java application to a Kubernetes cluster using Docker, with Shared Library for reusable steps and Trivy for image scanning.
## Step 1: Create Shared Library
- Created a `private` GitHub repository for the shared library:
  https://github.com/EmanElshahat/jenkins-shared-lib.git
 - Added reusable Groovy scripts for:
   1.  Test & Build App [buildApp.groovy](buildApp.groovy)
   2.  Build & Push Docker Image [buildAndPushImage.groovy](buildAndPushImage.groovy)
   3.  Deploy to Kubernetes [deployK8s.groovy](deployK8s.groovy)

## Step 2: Configure Shared Library in Jenkins
Added your private repository as a Shared Library In Jenkins:
![sharedlib](https://github.com/EmanElshahat/DevopsTasks/blob/8d8ae4ec6699c8b0bfba90cf07992dcaa1bf5932/Jenkins/lab23/screenshots/Screenshot%202026-01-30%20223636.png)

## Step 3: Clone Application Repository

```bash
git clone https://github.com/EmanElshahat/Jenkins_App_Pipeline.git
cd Jenkins_App_Pipeline
```

## Step 4: Update Jenkinsfile
Use the shared library for reusable steps:
[Jenkinsfile](Jenkinsfile)

## Step 5: Configure Jenkins Pipeline

- Pipeline → Definition → Pipeline script from SCM 
- SCM → Git → Repository URL: https://github.com/EmanElshahat/Jenkins_App_Pipeline.git 
- Branch → */main 
- Script Path → Jenkinsfil

## Step 6: Pipeline Execution 
![Execution](https://github.com/EmanElshahat/DevopsTasks/blob/dfde7d4554fc23ba979db589fcac4a29d02c61de/Jenkins/lab23/screenshots/Screenshot%202026-01-31%20025156.png)


## Summary
- Created a CI/CD pipeline in Jenkins using Shared Library.
- Automated Maven build, Docker image build/push, image scanning with Trivy, and Kubernetes deployment.
- Post actions ensure messages are printed based on build result.
- Shared Library enables reusability across multiple pipelines.
