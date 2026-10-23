FROM eclipse-temurin:17-jre
WORKDIR /app
COPY target/hello-devsecops-1.0.jar app.jar
CMD ["java", "-jar", "app.jar"]