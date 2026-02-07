# Lab 28
## Structured Configuration Management with Ansible Roles
In this lab, we will use Ansible Roles to structure and automate the configuration of a DevOps environment.
Instead of writing a single large playbook, the configuration is divided into reusable roles for better organization and scalability.

## Step 1: Prepare Inventory
Create an inventory file to define the managed node(s):
```bash
[lab]
192.168.6.128 ansible_user=eman ansible_become=yes
```

 [inventory](ansible/inventory)

## Step 2: Create Ansible Roles
Create separate roles for each component:
```bash
ansible-galaxy init docker
ansible-galaxy init kubectl
ansible-galaxy init jenkins
```
1. Docker role
```bash
nano roles/docker/tasks/main.yml
```
the file:  [Docker role](ansible/roles/docker/tasks/main.yml)

2. kubectl role
```bash
nano roles/kubectl/tasks/main.yml
```
the file:  [kubectl role](ansible/roles/kubectl/tasks/main.yml)

3. Jenkins role
```bash
nano roles/jenkins/tasks/main.yml
```
the file:  [Jenkins role](ansible/roles/jenkins/tasks/main.yml)

## Step 3: Create Main Playbook
Create a main playbook to run all roles in order:
```bash
nano site.yml
```
the file:  [site.yml](ansible/site.yml)

## Step 4: Run the Playbook
Execute the playbook from the control node:
```bash
ansible-playbook -i inventory site.yml --ask-become-pass
```

## Step 5: Verify Installation
```bash
docker --version
kubectl version --client
systemctl status jenkins
```

## Summary
- Structured configuration management using Ansible Roles.
- Automated installation of Docker, kubectl, and Jenkins.
- Improved readability and reusability compared to a single playbook.
- Idempotent execution ensures safe re-runs without breaking the system.
- Demonstrates real-world Ansible role-based automation workflow.



 
