package com.campusdual.cd2023bbe1g2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ontimize.jee.server.security.encrypt.IPasswordEncryptHelper;
import com.ontimize.jee.server.security.encrypt.PasswordBCryptHelper;

@SpringBootApplication
public class ServerApplication {

	public static void main(final String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	public IPasswordEncryptHelper passwordEncryptHelper() {
		return new PasswordBCryptHelper();
	}
}