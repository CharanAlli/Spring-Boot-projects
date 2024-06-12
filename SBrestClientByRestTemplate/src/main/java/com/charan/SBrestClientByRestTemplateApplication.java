package com.charan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SBrestClientByRestTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SBrestClientByRestTemplateApplication.class, args);
		String apiUrl="http://ec2-35-172-114-141.compute-1.amazonaws.com:8080/";
		RestTemplate rt=new RestTemplate();
		ResponseEntity<String>re=rt.getForEntity(apiUrl, String.class);
		String body=re.getBody();
		System.out.println(body);
	}

}
