package com.exam.deploy.DeploytoAWS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

//@SpringBootApplication
public class DeploytoAwsApplication {

	static RestTemplate restTemplate = new RestTemplate();
	static String baseUrl = "http://localhost:8888/student/";
	
	
	public static void main(String[] args) {
		//SpringApplication.run(DeploytoAwsApplication.class, args);
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeaders);
		
		ResponseEntity<String> responseEntity = restTemplate.exchange(baseUrl+"load",
												HttpMethod.GET,
												requestEntity,
												String.class);
		
		HttpStatus httpStatus = responseEntity.getStatusCode();
		System.out.println("Status Code.."+httpStatus);
		
		String  student = responseEntity.getBody();
		System.out.println("respnse body.."+student);
		
		HttpHeaders responseHeaders = responseEntity.getHeaders();
		System.out.println("response Headers.."+responseHeaders);
		
		
				
			
	}

}
