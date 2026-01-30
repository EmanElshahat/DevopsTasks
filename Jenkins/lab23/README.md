# Lab 23
## CI/CD Pipeline Implementation with Jenkins Agents and Shared Libraries
In this lab, we will create a Jenkins Pipeline that automates the CI/CD process for deploying a Java application to a Kubernetes cluster using Docker, with Shared Library for reusable steps and Trivy for image scanning.
## Step 1: Create Shared Library
- Created a private GitHub repository for the shared library:
  https://github.com/EmanElshahat/jenkins-shared-lib.git
 - Added reusable Groovy scripts for:
   1.  Test & Build App (buildApp.groovy)
