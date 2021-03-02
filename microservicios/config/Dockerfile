FROM openjdk:11
EXPOSE 7777
COPY ./target/config-0.0.1-SNAPSHOT.jar config-server.jar
ENTRYPOINT [ "java", "-jar", "config-server.jar" ]