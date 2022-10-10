FROM openjdk:8-alpine
COPY "./target/matriz-0.0.1-SNAPSHOT.jar" "matriz.jar"
EXPOSE 8080
ENTRYPOINT ["java","-jar","matriz.jar"]