#FROM ubuntu:latest
#LABEL authors="Tobias"
#
#ENTRYPOINT ["top", "-b"]
## Use an OpenJDK image as base
#FROM openjdk:22
#
## Set the working directory in the container
#WORKDIR /app
#
## Copy the JAR file into the container
#COPY target/currencyConverter.jar /app/currencyConverter.jar
#
## Command to run the application
#CMD ["java", "-jar", "currencyConverter.jar"]

#FROM eclipse-temurin:22-jre
#COPY target/lib/*.jar /app/lib/
##COPY target/currencyConverter.jar /app/currencyConverter.jar
#COPY consumer/target/currencyConverter.jar /app/currencyConverter.jar
##COPY target/testandbuild-1.0-SNAPSHOT.jar /app/app.jar
#ENTRYPOINT ["java","-cp","/app/app.jar:/app/lib/*","org.example"]

FROM eclipse-temurin:22-jre
#COPY target/lib/*.jar /app/lib/
COPY consumer/target/consumer-1.0-SNAPSHOT.jar /app/consumer-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-cp","/app/consumer-1.0-SNAPSHOT.jar:/app/lib/*","org.example.consumer.Main"]

