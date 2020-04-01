`1.打包eureka-server,server-consumer,server-provider,命令: mvn clean package -DskipTests docker:build
`

`2.对刚刚构建的三个镜像文件打标签,命令exp:docker tag e5ae9e3ece74 king1234/k8s_demo:consumer-v1.0.0
`

`3.docker push king1234/k8s_demo:consumer-v1.0.0 push到远程仓库
`

`4.依次执行kubectl create -f deploy/devops-sample.yaml;kubectl create -f deploy/devops-sample-svc.yaml
`