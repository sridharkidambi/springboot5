package sk.springframework.spring5webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import sk.springframework.spring5webapp.controller.booksController;
import sk.springframework.spring5webapp.model.author;
import sk.springframework.spring5webapp.model.books;
import sk.springframework.spring5webapp.repositories.AuthorInterface;
import sk.springframework.spring5webapp.repositories.BooksInterface;

@Component
public class customRunner implements CommandLineRunner {

    @Autowired
    private booksController booksController1;

    @Autowired
    private AuthorInterface authorInterface;

    @Autowired
    private BooksInterface booksInterface;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("I am custom commadlieRunner");
        this.initme();
        booksController1.getBooks(null);

    }

    private void initme(){

        author _sk=new author("Sridhar","kidambi");
        books _book = new books("jave","Srping");
        _sk.get_book().add(_book);


        booksInterface.save(_book);
        authorInterface.save(_sk);
    }
}
