package springframework.dependencyinjectiondemo.controllers;

import org.springframework.stereotype.Controller;
import springframework.dependencyinjectiondemo.services.GreetingService;

/**
 * Created by jt on 5/23/17.
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Hello!!! ");
        return greetingService.sayGreeting();
    }
}