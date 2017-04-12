package com.panda.distributed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //开启Eureka服务发现
public class DistributedDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DistributedDiscoveryApplication.class, args);
	}
}
