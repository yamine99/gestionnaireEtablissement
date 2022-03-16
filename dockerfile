FROM maven:3.8.4-openjdk-11-slim
RUN mkdir gestionnaire
COPY ./ /gestionnaire
WORKDIR /gestionnaire

RUN mvn clean package spring-boot:repackage
CMD [ "java", "-jar", "./target/webapp-0.0.1-SNAPSHOT.jar"] 