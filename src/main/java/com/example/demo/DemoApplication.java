package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.net.ssl.SSL;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "draganja", defaultValue = "draganja") String name) {

		return String.format("Hello %s", name);

	}

	@GetMapping("/salve")
	public String salve(@RequestParam(value="Galera", defaultValue = "Galera") String name){

		return String.format("Hello %s", name);

	}

	@GetMapping("/ola")
	public String ola(@RequestParam(value="florencePugh", defaultValue = "florencePugh") String name){

		return String.format("Hello %s", name);
	}

}
