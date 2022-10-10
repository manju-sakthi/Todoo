
FROM registry.access.redhat.com/ubi8/openjdk-17-runtime:latest

RUN mkdir /opt/app


USER 1001

WORKDIR /opt/app

CMD java $JAVA_OPTS -jar app.jar

COPY /target/todoo.jar /opt/app/app.jar

LABEL summary="todo application" \
  description="A tranining project" \
  version="0.1.10" \
  author="Manju" \
  build-date="20221010" \
  vcs-type=git
ENTRYPOINT ["java","-jar","/todoo-0.0.1-SNAPSHOT.jar"]