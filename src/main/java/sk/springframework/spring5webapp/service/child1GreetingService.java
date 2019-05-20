package sk.springframework.spring5webapp.service;

import org.springframework.stereotype.Service;

@Service
public class child1GreetingService implements  GreetingService {
    @Override
    public void orintme() {
        System.out.println("Hi I am child1GreetingService");
    }
}
