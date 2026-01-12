## Lab1
# Build Tools with Gradle

In this lab, we will learn how to build, test, and package a Java application using *Gradle*, and verify that it works correctly.

---

## Step 1: Clone the Repository

Clone the source code from GitHub:

```bash
git clone https://github.com/Ibrahim-Adel15/build2.git
cd build2 https://github.com/EmanElshahat/DevopsTasks.git
```
![Repository Cloned]( https://github.com/EmanElshahat/DevopsTasks/build-tools/lab1/blob/main/screenshots/p1.PNG))

## Step 2: Run Unit Test

Execute the unit tests for the project:

```bash
mvn test
```
![unit_test](https://github.com/Ibrahim-Adel15/Lab2-Demo/blob/main/screenshots/test.PNG)

## Step 3: Build the Project

Package the project into a JAR file using Maven:

```bash
mvn package
```
![Build](https://github.com/Ibrahim-Adel15/Lab2-Demo/blob/main/screenshots/package.PNG)

## Step 4: Run the Application

Run the packaged Java application using:

```bash
java -jar target/hello-ivolve-1.0-SNAPSHOT.jar
```
![Run](https://github.com/Ibrahim-Adel15/Lab2-Demo/blob/main/screenshots/run.PNG)

---

## Summary

The full workflow of using Maven in this project:

- Clone the repository from GitHub.
- Run unit tests to verify functionality.
- Build the JAR artifact with Maven.
- Run the application using the Java runtime.
