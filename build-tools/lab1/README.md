## Lab1
# Build Tools with Gradle

In this lab, we will learn how to build, test, and package a Java application using *Gradle*, and verify that it works correctly.

---
## Step 1: Install Gradle
Check Gradle version :

```bash
gradle -v
```
![Repository Cloned](https://github.com/EmanElshahat/DevopsTasks/blob/1f0eafcccb9ee9cdf5f243e78ba694a0ce708231/build-tools/lab1/screenshots/p1.png)

## Step 1: Clone the Repository

Clone the source code from GitHub:

```bash
git clone https://github.com/Ibrahim-Adel15/build2.git
cd build1
```
![Repository Cloned](https://github.com/EmanElshahat/DevopsTasks/blob/1f0eafcccb9ee9cdf5f243e78ba694a0ce708231/build-tools/lab1/screenshots/p1.png)

## Step 2: Run Unit Test

Execute the unit tests for the project:

```bash
gradle test
```
![unit_test](https://github.com/Ibrahim-Adel15/Lab2-Demo/blob/main/screenshots/test.PNG)

## Step 3: Build the Project

Package the project into a JAR file using Gradle:

```bash
gradle build
```
![Build](https://github.com/Ibrahim-Adel15/Lab2-Demo/blob/main/screenshots/package.PNG)

## Step 4: View the tree 
```bash
Tree
```

## Step 5: Run the Application

Run the packaged Java application using:

```bash
java -jar target/hello-ivolve-1.0-SNAPSHOT.jar
```
![Run](https://github.com/Ibrahim-Adel15/Lab2-Demo/blob/main/screenshots/run.PNG)

---
## Summary
The full workflow of using Gradle in this project:

- Install Gradle and verify the installation.
- Clone the repository from GitHub.
- Run unit tests to verify functionality.
- Build the JAR artifact with Gradle.
- Run the application using the Java runtime.
