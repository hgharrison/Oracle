/****************************************************
 * Author:			Hank Harrison
 * Description:		This project serves as a sample
 * 					project for the Oracle technical
 * 					demonstration.
 * Date:			04/15/2018
 ***************************************************/

import java.util.Optional;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static final Properties prop = new Properties();

	// Retrieve host and port variables or revert to local
	public static final Optional<String> host = Optional.ofNullable(System
			.getenv("HOSTNAME"));
	public static final Optional<String> port = Optional.ofNullable(System
			.getenv("PORT"));

	public static void main(String[] args) {

		prop.setProperty("server.address", (String) host.orElse("localhost"));
		prop.setProperty("server.port", (String) port.orElse("8080"));

		SpringApplication app = new SpringApplication(App.class);
		app.setDefaultProperties(prop);
		app.run(args);

	}
}