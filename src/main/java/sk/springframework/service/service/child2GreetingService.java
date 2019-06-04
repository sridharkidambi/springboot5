package sk.springframework.service.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class child2GreetingService implements  GreetingService {
    @Override
    public void orintme() {
        System.out.println("Hi I am child2GreetingService");
    }
}
