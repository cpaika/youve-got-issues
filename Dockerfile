FROM openjdk:8-jdk-alpine
VOLUME /tmp
# Building each jar with name and no version to reduce complexity.
# Can add in version later by looking at original code and spotify dockerfile repo examples
COPY target/app.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]