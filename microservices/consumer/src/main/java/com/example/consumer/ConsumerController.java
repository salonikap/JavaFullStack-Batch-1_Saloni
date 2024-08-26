package com.example.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@SpringBootApplication
public class ConsumerController {
	
	@Autowired
    RestTemplate restTemplate;
	@GetMapping("/consumer")
	public String GetMessage()
	{
		String msg=restTemplate.getForObject("http://localhost:8086/producer", String.class);
		return "Message from producer: "+msg;
	}
	
	

}
