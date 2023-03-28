FROM openjdk:17
WORKDIR /app
EXPOSE 8282
COPY build/libs/*.jar /app/app.jar
ENTRYPOINT exec java -jar app.jar