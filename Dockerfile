FROM tomcat:9.0.58-jdk17-openjdk-slim
RUN rm -rf /usr/local/tomcat/webapps/*
COPY ./target/employee-info-*.war /usr/local/tomcat/webapps/ROOT.war
CMD ["catalina.sh","run"]

