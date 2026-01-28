# Lab 21
## Role-Based Authorization in Jenkins

In this lab, we will configure role-based access control in Jenkins by creating users and assigning different permissions using the Role-Based Authorization Strategy plugin.

## Step 1: Install Role-Based Authorization Plugin
- Go to Jenkins Dashboard:
- Manage Jenkins → Plugins → Available Plugins
- Search for:
Role-Based Authorization Strategy
- Install the plugin and restart Jenkins
- 
![Role](https://github.com/EmanElshahat/DevopsTasks/blob/7d92e710f1401a886221cb0d5bcd8684aa5fd306/Jenkins/lab21/screenshots/1.png)

## Step 2: Enable Role-Based Authorization
- Manage Jenkins → Security
- Under Authorization, select: Role-Based Strategy
- Save the configuration.

 ## Step 3: Create Jenkins Users
- Create user1 (Admin User)
Manage Jenkins → Users → Create User
- Create user2 (Read-Only User)
Manage Jenkins → Users → Create User

![create](https://github.com/EmanElshahat/DevopsTasks/blob/7d92e710f1401a886221cb0d5bcd8684aa5fd306/Jenkins/lab21/screenshots/2.png)

## Step 4: Create Roles
- Manage Jenkins → Manage and Assign Roles → Manage Roles
- Role Name: admin
Assign all available permissions.
- Role Name: read-only
Assign only some permissions
![create](https://github.com/EmanElshahat/DevopsTasks/blob/7d92e710f1401a886221cb0d5bcd8684aa5fd306/Jenkins/lab21/screenshots/3.png)

## Step 5: Assign Roles to Users
Manage Jenkins → Manage and Assign Roles → Assign Roles

![create](https://github.com/EmanElshahat/DevopsTasks/blob/7d92e710f1401a886221cb0d5bcd8684aa5fd306/Jenkins/lab21/screenshots/4.png)

## Step 6: Verify Access
Login as user1

![create](https://github.com/EmanElshahat/DevopsTasks/blob/7d92e710f1401a886221cb0d5bcd8684aa5fd306/Jenkins/lab21/screenshots/5.png)

Login as user2

![create](https://github.com/EmanElshahat/DevopsTasks/blob/7d92e710f1401a886221cb0d5bcd8684aa5fd306/Jenkins/lab21/screenshots/6.png)

## Summary
- Implemented role-based authorization in Jenkins.
- Installed and configured Role-Based Authorization Strategy plugin.
- Created two users with different access levels.
- Assigned admin role to user1 with full permissions.
- Assigned read-only role to user2 with limited permissions.
- Successfully verified access control based on assigned roles.


