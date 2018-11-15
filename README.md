# README

This is an extension of the code sample from the comprehensive tutorial [How to use Gradle and Gatling to automate the load tests of a Spring Boot web service](https://brokenrhythm.blog/gradle-gatling-springboot-automation).

In the context of a Gradle build, this code demonstrates how to automate the load tests of a Spring Boot based RESTful Web Service by executing a .jar Gatling performance test archive in a dockerized Taurus test harness.

## How to install 

Clone this repository:

```
$ git clone https://github.com/djangofan/gatling-with-gradle-taurus-and-docker.git
```

Build with **gradle**:

```
$ cd gatling-with-gradle-taurus-and-docker
$ ./gradlew build
```

##  How to run demo test load

Start the test load with:
```
$ ./gradlew testLoad
```

