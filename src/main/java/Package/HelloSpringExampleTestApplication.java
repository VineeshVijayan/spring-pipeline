package Package;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloSpringExampleTestApplication {

	@GetMapping("/test")
	public String testData(){
		return "This is A Test Data Program...!";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringExampleTestApplication.class, args);
	}

}
