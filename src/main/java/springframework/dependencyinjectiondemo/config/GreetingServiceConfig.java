package springframework.dependencyinjectiondemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import springframework.dependencyinjectiondemo.services.GreetingRepository;
import springframework.dependencyinjectiondemo.services.GreetingService;
import springframework.dependencyinjectiondemo.services.GreetingServiceFactory;

@Configuration
public class GreetingServiceConfig  {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository repository){
        return new GreetingServiceFactory(repository);
    }

    @Bean
    @Primary
    @Profile("de")
    GreetingService PrimaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("de");
    }

    @Bean
    @Primary
    @Profile("es")
    GreetingService PrimarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("es");
    }

    @Bean
    @Primary
    @Profile({"default","en"})
    GreetingService PrimaryGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("en");
    }
}
