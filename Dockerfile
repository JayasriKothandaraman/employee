FROM openjdk:8
ARG JAR_FILE=build/libs/*.jar
EXPOSE 8080
COPY ${JAR_FILE} employee.jar
ENTRYPOINT ["java","-jar","/employee.jar"]