package springframework.dependencyinjectiondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springframework.dependencyinjectiondemo.controllers.ConstructorInjectedController;
import springframework.dependencyinjectiondemo.controllers.GetterInjectedController;
import springframework.dependencyinjectiondemo.controllers.MyController;
import springframework.dependencyinjectiondemo.controllers.PropertyInjectedController;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionDemoApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");
        myController.hello();

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

    }

}

