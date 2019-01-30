package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import app.sample.SampleService;

@SpringBootApplication
public class AppMultiprojSpringJavaGradleCoreApplication  implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(AppMultiprojSpringJavaGradleCoreApplication.class, args);
	}
	@Autowired
	SampleService service;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		service.sample();
	}

}

