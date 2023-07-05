FROM tomcat:10.0.27

EXPOSE 8080:8080

COPY ./build/libs/servlet.war /usr/local/tomcat/webapps

WORKDIR /usr/local/tomcat

CMD ["catalina.sh", "run"]
