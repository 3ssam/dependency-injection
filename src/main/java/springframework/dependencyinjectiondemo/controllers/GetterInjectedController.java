package springframework.dependencyinjectiondemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import springframework.dependencyinjectiondemo.services.GreetingService;

/**
 * Created by jt on 5/24/17.
 */
@Controller
public class GetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService( GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
