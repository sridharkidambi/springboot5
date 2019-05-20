package sk.springframework.spring5webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.ui.Model;
import sk.springframework.spring5webapp.controller.booksController;

import java.util.Collection;
import java.util.Map;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=  SpringApplication.run(Spring5webappApplication.class, args);
		((booksController)ctx.getBean("booksController")).getBooks(new Model() {
			@Override
			public Model addAttribute(String s, Object o) {
				return null;
			}

			@Override
			public Model addAttribute(Object o) {
				return null;
			}

			@Override
			public Model addAllAttributes(Collection<?> collection) {
				return null;
			}

			@Override
			public Model addAllAttributes(Map<String, ?> map) {
				return null;
			}

			@Override
			public Model mergeAttributes(Map<String, ?> map) {
				return null;
			}

			@Override
			public boolean containsAttribute(String s) {
				return false;
			}

			@Override
			public Map<String, Object> asMap() {
				return null;
			}
		});
	}

}
