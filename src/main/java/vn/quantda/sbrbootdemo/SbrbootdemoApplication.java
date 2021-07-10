package vn.quantda.sbrbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SbrbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbrbootdemoApplication.class, args);
	}

}
