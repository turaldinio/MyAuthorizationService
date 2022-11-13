FROM adoptopenjdk/openjdk11:alpine-jre

EXPOSE 8080

ADD target/DockerDemo-0.0.1-SNAPSHOT.jar app.jar


