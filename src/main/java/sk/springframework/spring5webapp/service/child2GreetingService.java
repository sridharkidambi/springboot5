package sk.springframework.spring5webapp.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class child2GreetingService implements  GreetingService {
    @Override
    public void orintme() {
        System.out.println("Hi I am child2GreetingService");
    }
}
