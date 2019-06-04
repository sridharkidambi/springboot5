package sk.springframework.spring5webapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sk.springframework.spring5webapp.repositories.BooksInterface;
import sk.springframework.service.service.GreetingService;

@Controller
public class booksController {

    @Autowired
    private BooksInterface booksInterface;

    @Autowired
    @Qualifier("child2GreetingService")
    private GreetingService greetingService;

    @Autowired
    private  GreetingService child2GreetingService;

    @Autowired
    private  GreetingService customGreetingService;

    @RequestMapping("/books")
    public  String getBooks(Model model){
        greetingService.orintme();
        child2GreetingService.orintme();
        customGreetingService.orintme();
        if(model!=null) {
            model.addAttribute("books", booksInterface.findAll());
            return "books";
        }
        return null;

    }

}
