# Dockerfile for api gateway microservice
FROM java:8
MAINTAINER Claudio de Oliveira<claudioed.oliveira@gmail.com>
VOLUME /tmp
ADD target/product-1.0-SNAPSHOT.jar product.jar
RUN bash -c 'touch /user.jar'
EXPOSE 8080
ENTRYPOINT ["java","-jar","/product.jar"]