FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/kubectl-demo.jar kubectl-demo.jar

EXPOSE 8080

ENTRYPOINT [ "java","-jar","kubectl-demo.jar" ]