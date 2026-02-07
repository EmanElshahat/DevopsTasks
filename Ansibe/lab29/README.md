# Lab 29
## Securing Sensitive Data with Ansible Vault
In this lab, we automate MySQL installation and database configuration using Ansible Playbooks, while securing sensitive credentials using Ansible Vault.

## Step 1: Prepare Inventory
Create an inventory file to define the managed node:

file: [inventory](inventory)

## Step 2: Create Encrypted File Using Ansible Vault
Create an encrypted file named secret.yaml to store sensitive MySQL data:
```bash
ansible-vault create secret.yaml
```
Inside [secret.yaml](secret.yaml), add the following:
```bash
mysql_user: eman
mysql_password: 123
mysql_database: iVolve
```

## Step 3: Create Ansible Playbook
Create the playbook to install and configure MySQL:
file: [mysql.yaml](mysql.yaml)

## Step 4: Run the Playbook
Run the playbook and enter the vault password and BECOME password:
```bash
ansible-playbook -i inventory mysql.yaml --ask-vault-pass --ask-become-pass
```
![Run](https://github.com/EmanElshahat/DevopsTasks/blob/d2bf932bce1f544df4ff442c88fceb59d1c1a923/Ansibe/lab29/screenshots/1.png)

## Step 5: Verify Database Configuration
```bash
mysql -u eman -p
```
Enter the password (123), then execute:
```bash
SHOW DATABASES;
```

![Run](https://github.com/EmanElshahat/DevopsTasks/blob/d2bf932bce1f544df4ff442c88fceb59d1c1a923/Ansibe/lab29/screenshots/2.png)

## Summary
- Automated MySQL installation using Ansible.
- Sensitive data stored securely in an encrypted file (secret.yaml).
- Database and user created automatically with full privileges.
- Verified database access using the created user.
- Demonstrates secure configuration management with Ansible Vault.
