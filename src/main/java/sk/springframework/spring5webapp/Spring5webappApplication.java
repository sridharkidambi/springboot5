package sk.springframework.spring5webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import sk.springframework.spring5webapp.controller.booksController;

@SpringBootApplication
@ComponentScan(basePackages = {"sk.springframework.service.service","sk.springframework.spring5webapp"})
public class Spring5webappApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=  SpringApplication.run(Spring5webappApplication.class, args);
		booksController booksController=  (booksController)ctx.getBean("booksController");
		booksController.getBooks(null);
	}

}
