FROM openjdk:17-alpine
ARG JAR_FILE=build/libs/config-map-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} config-map-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar", "config-map-0.0.1-SNAPSHOT.jar"]
