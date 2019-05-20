package sk.springframework.spring5webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import sk.springframework.spring5webapp.controller.booksController;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=  SpringApplication.run(Spring5webappApplication.class, args);
		booksController booksController=  (booksController)ctx.getBean("booksController");
		booksController.getBooks(null);
	}

}
