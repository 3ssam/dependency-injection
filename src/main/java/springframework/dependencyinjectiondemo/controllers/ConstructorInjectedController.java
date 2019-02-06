package springframework.dependencyinjectiondemo.controllers;

import springframework.dependencyinjectiondemo.services.GreetingService;

/**
 * Created by jt on 5/24/17.
 */
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
