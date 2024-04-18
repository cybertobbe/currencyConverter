


FROM eclipse-temurin:22-jre
COPY consumer/target/consumer-1.0-SNAPSHOT.jar /app/consumer-1.0-SNAPSHOT.jar
COPY provider/target/provider-1.0-SNAPSHOT.jar /app/provider-1.0-SNAPSHOT.jar
COPY service/target/service-1.0-SNAPSHOT.jar /app/service-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-p","/app/consumer-1.0-SNAPSHOT.jar:/app/provider-1.0-SNAPSHOT.jar:/app/service-1.0-SNAPSHOT.jar","-m","consumer/com.example.consumer.Main"]


