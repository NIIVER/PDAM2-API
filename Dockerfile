FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY target/PDAM2-0.0.1-SNAPSHOT.jar /app/

RUN ./mvnw clean package -DskipTests

EXPOSE 8080

CMD ["java","-jar","target/PDAM2-0.0.1-SNAPSHOT.jar"]