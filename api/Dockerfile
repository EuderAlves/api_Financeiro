FROM ubuntu:latest AS build

WORKDIR src

RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
COPY . .

RUN apt-get install maven -y
RUN mvn clean install

FROM openjdk:17-oracle

EXPOSE 8094

COPY --from=build /target/application.jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]

C:\Users\emartalv\OneDrive - NTT DATA EMEAL\Escritorio\Euder\api_Financeiro\api\Dockerfile