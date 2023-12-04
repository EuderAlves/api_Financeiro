FROM ubuntu:latest AS build

RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
COPY . .

RUN apt-get install maven -y
RUN mvn clean install

FROM openjdk:17-oracle

EXPOSE 8094

COPY --from=build ../api/target/application.jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]