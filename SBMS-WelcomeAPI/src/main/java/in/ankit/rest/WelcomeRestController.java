package in.ankit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@Autowired
	private Environment env;

	@GetMapping("/welcome")
	public String welcomeMsg() {
		
		String port = env.getProperty("server.port"); // To get the server port in the load balancing
		String msg = "Welcome to SBMS"+"(Port::"+port+")";
		return msg;

	}
}
