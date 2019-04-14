## Youve Got Issues!

Have you ever wanted to get notified when a new issue is created with a certain tag in your favorite open source project?
This is a project that watches repositories, and notifies email addresses if a new issue with a specific tag is created

### How To Build
NOTE: You must have Maven and Docker installed on your machine to build this project.

1.  Run `mvn clean install`
1.  Run `docker-compose up`
1.  Navigate to [localhost/hello]() to see the application running


### How to debug 
The docker-compose file will start a [Jaeger](https://www.jaegertracing.io/) server and a [Prometheus](https://prometheus.io/) server

The Jaeger server is exposed here: http://localhost:8081/
The Prometheus server is exposed here: http://localhost:9090/