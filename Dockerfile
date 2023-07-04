FROM tomcat:9

COPY ./build/libs/servlet.war /usr/local/tomcat/webapps

CMD ["catalina.sh", "run"]
