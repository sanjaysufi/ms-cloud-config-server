package com.cloudsufi.cloudconfig.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MsCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCloudConfigServerApplication.class, args);
	}

}
