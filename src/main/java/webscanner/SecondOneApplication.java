package webscanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("webscanner.*")
public class SecondOneApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SecondOneApplication.class, args);
	}


}
