package sk.springframework.spring5webapp.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import sk.springframework.spring5webapp.model.author;
import sk.springframework.spring5webapp.model.books;
import sk.springframework.spring5webapp.repositories.AuthorInterface;
import sk.springframework.spring5webapp.repositories.BooksInterface;

import java.util.HashSet;

@Component
public class bootstrapme {

    @Autowired
    private AuthorInterface authorInterface;

    @Autowired
    private BooksInterface booksInterface;

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        this.initme();
    }

    private void initme(){

        author _sk=new author("Sridhar","kidambi");
        books _book = new books("java","Spring");
        _sk.get_book().add(_book);
        booksInterface.save(_book);
        _book = new books("dotnet","c#");
        _sk.get_book().add(_book);

        booksInterface.save(_book);
        authorInterface.save(_sk);
    }
}
