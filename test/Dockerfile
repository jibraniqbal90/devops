FROM openjdk:17-alpine
ARG JAR_FILE=build/libs/test-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} test-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar", "test-0.0.1-SNAPSHOT.jar"]
