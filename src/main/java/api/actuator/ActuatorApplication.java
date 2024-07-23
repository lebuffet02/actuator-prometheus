package api.actuator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.Date;
import java.util.Locale;

@SpringBootApplication
public class ActuatorApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(ActuatorApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ActuatorApplication.class, args);
	}

	@Bean
	public CommandLineRunner initializeLogs() {
		return (args) -> {
			LOGGER.info("-------------SUBIU-------------");
			LOGGER.info(String.valueOf(new Date()).concat(new Locale(" pt", "BR").toString()));
		};
	}
}