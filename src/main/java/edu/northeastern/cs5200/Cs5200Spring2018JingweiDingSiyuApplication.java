package edu.northeastern.cs5200;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Cs5200Spring2018JingweiDingSiyuApplication extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Cs5200Spring2018JingweiDingSiyuApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(Cs5200Spring2018JingweiDingSiyuApplication.class, args);
	}
}
