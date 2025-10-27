package in.ankit.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
 
//@FeignClient(url = "http://localhost:Welcome-API:8081") // We can't achieve the Load balancing.
@FeignClient(name = "WELCOME-API")  // Service name is recommended than Service URL.
public interface WelcomeApiClient {
    
	@GetMapping("/welcome")
	public String invokeWelcomeApi();
}
