package com.example.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@SpringBootApplication
public class ProducerController {
	
	
	@GetMapping("/producer")
	public String GetMessage()
	{
		
		return "Producer message";
	}
	
	

}
