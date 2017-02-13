package com.virtualpairprogrammers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Value;
import com.netflix.appinfo.AmazonInfo;

@SpringBootApplication
@EnableDiscoveryClient
public class PositionreceiverApplication {

	public static void main(String[] args) {
		SpringApplication.run(PositionreceiverApplication.class, args);
	}

}
