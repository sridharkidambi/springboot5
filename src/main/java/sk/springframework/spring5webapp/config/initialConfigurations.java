package sk.springframework.spring5webapp.config;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import sk.springframework.service.service.GreetingService;
import sk.springframework.service.service.child1GreetingService;
import sk.springframework.service.service.child2GreetingService;

@Configuration
public class initialConfigurations {

    @Bean
    @Primary
    @Profile("child2")
    public GreetingService child2GreetingService(){

        return new child2GreetingService();
    }


    @Bean
    @Profile("child1")
    public GreetingService child1GreetingService(){

        return new child1GreetingService();
    }

}
