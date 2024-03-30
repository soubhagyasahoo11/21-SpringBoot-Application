package in.sahoo.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
private static final String REST_URL="http://www.equifax.com.getscores";
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		int i=1;
	}

}
