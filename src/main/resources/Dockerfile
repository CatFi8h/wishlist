FROM openjdk:1.8
CMD ["mkdir", "app"]
WORKDIR app/
COPY gradle/gradle-wrapper.jar app/app.jar
EXPOSE 8082
CMD ["java", "-jar", "app/app.jar"]
