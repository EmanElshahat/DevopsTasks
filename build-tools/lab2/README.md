## Lab2
# Build Tools with Maven

In this lab, we will learn how to build, test, and package a Java application using *Maven*, and verify that it works correctly.

---

## Step 1: Install Maven
Check Maven version:

```bash
mvn -v
```

## Step 2: Clone the Repository

Clone the source code from GitHub:

```bash
git clone https://github.com/Ibrahim-Adel15/build2.git
cd build2
```

## Step 3:Step 3: Run Unit Test

Execute the unit tests for the project:

```bash
mvn test
```
![unit_test](https://github.com/EmanElshahat/DevopsTasks/blob/f7dfeaff393cb922395a4b09d67eea3f2c7485b6/build-tools/lab2/screenshots/p1.png)

## Step 4: Build the Project

Package the project into a JAR file using Gradle:

```bash
mvn package
```
![Build](https://github.com/EmanElshahat/DevopsTasks/blob/fd9bb56d4c4cda7c61b650720e45983536353547/build-tools/lab2/screenshots/p2.png)

## Step 5: View the tree 
Run the tree command to see folder structure:
```bash
Tree
```
![view](https://github.com/EmanElshahat/DevopsTasks/blob/7fd7b04756e6baff6d526c747ae771aad817d965/build-tools/lab2/screenshots/p3.png)
## Step 6: Run the Application

Run the packaged Java application using:

```bash
java -jar build/libs/ivolve-app.jar
```
![Run](https://github.com/EmanElshahat/DevopsTasks/blob/a77bfd8f197286a6408bd35a3dd65aa318f6870f/build-tools/lab2/screenshots/p4.png)

---
## Summary

- The full workflow of using Maven in this project:
- Install Maven and verify the installation.
- Clone the repository from GitHub.
- Run unit tests to verify functionality.
- Build the JAR artifact with Maven.
- Run the application using the Java runtime.

