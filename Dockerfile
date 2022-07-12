FROM openjdk:8-jdk-alpine AS base
ENV APP_HOME=/app/
COPY src $APP_HOME/src
COPY .mvn $APP_HOME/.mvn
COPY mvnw $APP_HOME/mvnw
COPY mvnw.cmd $APP_HOME/mvnw.cmd
COPY pom.xml $APP_HOME/pom.xml
WORKDIR $APP_HOME
RUN ./mvnw clean install

FROM openjdk:8-jdk-alpine
COPY --from=base app/target deployments/target
ENTRYPOINT ["java", "-server", "-Xms512m", "-Xmx1g", "-jar", "deployments/target/app-0.0.1-SNAPSHOT.war"]
