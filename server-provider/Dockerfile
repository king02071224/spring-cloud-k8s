FROM java:8
ADD target/server-provider-1.0.0.jar server-provider-1.0.0.jar
ENTRYPOINT ["java","-jar","-Duser.timezone=GMT+08","server-provider-1.0.0.jar"]