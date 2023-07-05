# Servlet for Tomcat

## Build and run

```bash
./gradlew clean war

# create docker container with war file
docker build --tag=tomcat-war .

# run docker container
docker run --name=tomcat-container -it tomcat-war   
```

You can reach the servlet at `http://localhost:8080/servlet/test`
