FROM openjdk:18-jdk-alpine

EXPOSE 8081

ADD build/libs/spingBootDemo-0.0.1-SNAPSHOT.jar myapp.jar

ENTRYPOINT ["java", "-jar", "myapp.jar"]