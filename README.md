# Gatling with Gradle, Taurus, Docker, AND Jenkins

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

##  How to run demo test load standalone

Start the test load with:
```
$ ./gradlew testLoad
```

##  How to run demo test load in the Taurus harness

Run this bash script to start the Taurus test harness:
```
$ ./startTaurus.sh
```

## Other Info

https://www.blazemeter.com/blog/how-integrate-docker-jenkins

https://wiki.jenkins.io/display/JENKINS/Gatling+Plugin


