# Lab 27
## Automated Web Server Configuration Using Ansible Playbooks
In this lab, we will automate the setup and configuration of a web server using Ansible Playbooks. This eliminates the need for manual installation and configuration on the managed node.
## Step 1: Prepare Inventory
Create an inventory file to define managed nodes:
 [inventory](inventory)

## Step 2: Create Ansible Playbook
Create a playbook webserver.yml on the control node:
[ webserver.yml]( webserver.yml)
## Step 3: Run the Playbook
Execute the playbook on the control node:
```bash
ansible-playbook -i inventory webserver.yml
```
![Run](https://github.com/EmanElshahat/DevopsTasks/blob/b80fbccb1299637f70c2bff83d8e76f8f806bb76/Ansibe/lab27/screenshots/1.png)

## Step 4: Verify Configuration
1. From terminal on control node:
  ```bash
curl http://192.168.6.128
```
![terminal](https://github.com/EmanElshahat/DevopsTasks/blob/b80fbccb1299637f70c2bff83d8e76f8f806bb76/Ansibe/lab27/screenshots/2.png)

2. From a browser:
Open http://192.168.6.128 to see the customized Nginx page.

![browser](https://github.com/EmanElshahat/DevopsTasks/blob/b80fbccb1299637f70c2bff83d8e76f8f806bb76/Ansibe/lab27/screenshots/3.png)

## Summary
- Automated Nginx installation and setup using Ansible.
- Customized web page deployed automatically.
- Idempotent playbook ensures repeated runs do not break configuration.
- Demonstrates basic Ansible playbook workflow and managed node execution.
