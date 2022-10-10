FROM openjdk:18-jdk-alpine
MAINTAINER perfomatix.com
COPY target/todoo-0.0.1-SNAPSHOT.jar todoo-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/todoo-0.0.1-SNAPSHOT.jar"]