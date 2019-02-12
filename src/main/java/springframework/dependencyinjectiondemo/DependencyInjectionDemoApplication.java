package springframework.dependencyinjectiondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import springframework.dependencyinjectiondemo.controllers.ConstructorInjectedController;
import springframework.dependencyinjectiondemo.controllers.GetterInjectedController;
import springframework.dependencyinjectiondemo.controllers.MyController;
import springframework.dependencyinjectiondemo.controllers.PropertyInjectedController;
import springframework.dependencyinjectiondemo.examplebeans.FakeDataSource;
import springframework.dependencyinjectiondemo.examplebeans.FakeJmsBroker;

@SpringBootApplication
@ComponentScan(basePackages = {"springframework.dependencyinjectiondemo.services","springframework"})
public class DependencyInjectionDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionDemoApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");
        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.toString());
        FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);
        System.out.println(fakeJmsBroker.toString());


        /*System.out.println(myController.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());*/

    }

}

