package com.triestream.tsdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class TsDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TsDiscoveryServiceApplication.class, args);
    }

}
