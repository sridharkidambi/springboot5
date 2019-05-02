package sk.springframework.spring5webapp.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import sk.springframework.spring5webapp.model.author;
import sk.springframework.spring5webapp.repositories.AuthorInterface;
import sk.springframework.spring5webapp.repositories.BooksInterface;

@Component
public class bootstrapme implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private AuthorInterface authorInterface;

    @Autowired
    private BooksInterface booksInterface;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
this.initme();
    }

    private void initme(){

        author _author=new author("Sridhar","kidambi");

        authorInterface.save(_author);
    }
}
