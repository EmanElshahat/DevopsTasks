# Lab 26
## Initial Ansible Configuration and Ad-Hoc Execution
In this lab, we introduce Ansible as a configuration management and automation tool used in DevOps.
We configure the Ansible control node, establish secure SSH communication with a managed node, create an inventory file, and execute ad-hoc commands to manage remote systems.

## Step 1: Install Ansible on Control Node
Installed Ansible on the control node using the system package manager.
```bash
sudo apt update
sudo apt install ansible -y
```
Verified installation:

```bash
ansible --version
```
![create](https://github.com/EmanElshahat/DevopsTasks/blob/547490d7b83942a022f53b1d12b0fe47061882e7/K8s/lab13/screenshots/p1.png)

## Step 2: Generate SSH Key on Control Node

Generated a new SSH key pair to enable passwordless authentication:
```bash
ssh-keygen
```
![create](https://github.com/EmanElshahat/DevopsTasks/blob/547490d7b83942a022f53b1d12b0fe47061882e7/K8s/lab13/screenshots/p1.png)

## Step 3: Copy SSH Public Key to Managed Node
Transferred the public key to the managed node to allow Ansible to connect via SSH:
```bash
ssh-copy-id eman@192.168.6.128
```
![create](https://github.com/EmanElshahat/DevopsTasks/blob/547490d7b83942a022f53b1d12b0fe47061882e7/K8s/lab13/screenshots/p1.png)

## Step 4: Create Ansible Inventory File
Created an inventory file to define the managed node:
```bash
mkdir ansible
cd ansible
vim inventory
```
[inventory](inventory)

## Step 5: Test Connectivity with Ansible Ping Module
Verified Ansible communication with the managed node:
```bash
ansible -i inventory managed -m ping
```
![create](https://github.com/EmanElshahat/DevopsTasks/blob/547490d7b83942a022f53b1d12b0fe47061882e7/K8s/lab13/screenshots/p1.png)

## Step 6: Execute Ad-Hoc Command (Check Disk Space)
Used an ad-hoc command to check disk usage on the managed node:
```bash
ansible -i inventory managed -m command -a "df -h"
```
![create](https://github.com/EmanElshahat/DevopsTasks/blob/547490d7b83942a022f53b1d12b0fe47061882e7/K8s/lab13/screenshots/p1.png)

## Summary
- Installed and configured Ansible on the control node.
- Established secure SSH communication with the managed node.
- Created an inventory file to manage hosts.
- Created an inventory file to manage hosts.
- Demonstrated basic Ansible workflow without using agents.
