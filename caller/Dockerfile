FROM openjdk:17-alpine
ARG JAR_FILE=build/libs/caller-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} caller-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar", "caller-0.0.1-SNAPSHOT.jar"]
