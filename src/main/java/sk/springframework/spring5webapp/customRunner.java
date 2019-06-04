package sk.springframework.spring5webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import sk.springframework.spring5webapp.controller.booksController;

@Component
public class customRunner implements CommandLineRunner {

    @Autowired
    private booksController booksController1;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("I am custom commadlieRunner");
        booksController1.getBooks(null);

    }
}
