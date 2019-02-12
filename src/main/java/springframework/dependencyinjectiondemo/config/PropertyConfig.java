package springframework.dependencyinjectiondemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import springframework.dependencyinjectiondemo.examplebeans.FakeDataSource;
import springframework.dependencyinjectiondemo.examplebeans.FakeJmsBroker;

@Configuration
//@PropertySource({"classpath:jms.properties","classpath:datasource.properties"})
/*
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
*/
public class PropertyConfig {


    @Value("${mo.username}")
    String user;

    @Value("${mo.password}")
    String password;

    @Value("${mo.url}")
    String url;

    @Value("${mo.jms.username}")
    String user_jms;

    @Value("${mo.jms.password}")
    String password_jms;

    @Value("${mo.jms.url}")
    String url_jms;


    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        fakeDataSource.setUser(user);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setPassword(password_jms);
        fakeJmsBroker.setUrl(url_jms);
        fakeJmsBroker.setUsername(user_jms);
        return fakeJmsBroker;
    }

/*
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        return new PropertySourcesPlaceholderConfigurer();
    }
*/
}
