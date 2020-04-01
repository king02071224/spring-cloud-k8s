package com.wangtian.serverprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wangtian
 */
@SpringBootApplication
@EnableEurekaClient
public class ServerProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerProviderApplication.class, args);
	}

}
