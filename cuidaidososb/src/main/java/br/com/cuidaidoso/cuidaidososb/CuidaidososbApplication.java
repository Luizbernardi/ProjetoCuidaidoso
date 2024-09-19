package br.com.cuidaidoso.cuidaidososb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "br.com.cuidaidoso.cuidaidososb.repository")
public class CuidaidososbApplication {

	public static void main(String[] args) {
		SpringApplication.run(CuidaidososbApplication.class, args);
	}

}
