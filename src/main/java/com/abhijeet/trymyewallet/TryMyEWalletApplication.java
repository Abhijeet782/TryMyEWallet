package com.abhijeet.trymyewallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value={"classpath:message.properties"})
public class TryMyEWalletApplication {

	public static void main(String[] args) {
		SpringApplication.run(TryMyEWalletApplication.class, args);
	}

}
