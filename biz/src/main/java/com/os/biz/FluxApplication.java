package com.os.biz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.os.biz")
public class FluxApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(FluxApplication.class, args);
		
	}

}
