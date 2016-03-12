package ba.os;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication implements CommandLineRunner{
	private static final Logger log = LoggerFactory.getLogger(HelloworldApplication.class);

	@Override
	public void run(String... strings) throws Exception {
		log.info("Barclays Africa: Hello to the open source world. We have cookies!");
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}
}
