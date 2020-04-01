FROM java:8
ADD target/eureka-server-1.0.0.jar eureka-server-1.0.0.jar
ENTRYPOINT ["java","-jar","-Duser.timezone=GMT+08","eureka-server-1.0.0.jar"]