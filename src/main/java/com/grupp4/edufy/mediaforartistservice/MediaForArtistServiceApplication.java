package com.grupp4.edufy.mediaforartistservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MediaForArtistServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediaForArtistServiceApplication.class, args);
	}

}
