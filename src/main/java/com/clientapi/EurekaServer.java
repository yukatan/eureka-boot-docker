package com.clientapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Jesus Barquín on 24/05/15.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {


    public static void main(String args[]){

        new SpringApplicationBuilder(EurekaServer.class).web(true).run(args);
    }
}
