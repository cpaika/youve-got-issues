## Youve Got Issues!

Have you ever wanted to get notified when a new issue is created with a certain tag in your favorite open source project?
This is a project that watches repositories, and notifies email addresses if a new issue with a specific tag is created

### How To Build
1.  Run `mvn clean install`
1.  Run `docker run -p 8080:8080 cpaika/tag-watcher-svc:0.0.1-SNAPSHOT`
1.  Navigate to [localhost:8080/hello]() to see the application running