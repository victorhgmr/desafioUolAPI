package victormr.desafiouol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import victormr.desafiouol.service.CodinameService;

@SpringBootApplication
public class DesafiouolApplication {
	@Autowired
	private static CodinameService service;
	public static void main(String[] args) {
		SpringApplication.run(DesafiouolApplication.class, args);

	}

}
