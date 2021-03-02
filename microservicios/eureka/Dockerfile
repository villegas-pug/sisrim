FROM openjdk:11
EXPOSE 8761
COPY ./target/eureka-0.0.1-SNAPSHOT.jar eureka-server.jar
ENTRYPOINT [ "java", "-jar", "eureka-server.jar" ]