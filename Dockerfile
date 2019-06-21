FROM centos

RUN yum install -y java

EXPOSE 8089

VOLUME /tmp
RUN sh -c 'ls -latr'
ADD  ./target/spring5webapp-0.0.1.jar  SK-Sample.jar
RUN sh -c 'touch /SK-Sample.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-jar", "SK-Sample.jar" ]