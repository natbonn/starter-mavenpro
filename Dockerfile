FROM amazoncorretto:21
WORKDIR /app
COPY target/starter-mavenpro-0.0.1-SNAPSHOT.jar ./myapp.jar
CMD ["java", "-jar", "myapp.jar"]