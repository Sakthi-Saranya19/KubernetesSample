package kubectl.kubectl.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Controller {

	@RequestMapping("/message")
	public String getMesaage() {
		return "Application running on Kubernetes cluster's node!";
	}
	
	
	
}
