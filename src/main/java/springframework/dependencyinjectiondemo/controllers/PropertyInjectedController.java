package springframework.dependencyinjectiondemo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import springframework.dependencyinjectiondemo.services.GreetingService;
import springframework.dependencyinjectiondemo.services.GreetingServiceImpl;

/**
 * Created by jt on 5/24/17.
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }

}
