FROM openjdk:17-oracle
# Default to UTF-8 file.encoding
ENV LANG C.UTF-8
# Default copy (Gradle)
COPY ./target/*.jar /api/application.jar
# Default workspace dir
RUN ls /api
WORKDIR /api
# no root execution
USER root
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-Doracle.jdbc.timezoneAsRegion=false", "-jar", "/api/application.jar"]