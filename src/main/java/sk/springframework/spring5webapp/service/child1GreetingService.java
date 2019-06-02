package sk.springframework.spring5webapp.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("child1")
public class child1GreetingService implements  GreetingService {
    @Override
    public void orintme() {
        System.out.println("Hi I am child1GreetingService");
    }
}
