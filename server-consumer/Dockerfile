FROM java:8
ADD target/server-consumer-1.0.0.jar server-consumer-1.0.0.jar
ENTRYPOINT ["java","-jar","-Duser.timezone=GMT+08","server-consumer-1.0.0.jar"]