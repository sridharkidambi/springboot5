package sk.springframework.spring5webapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sk.springframework.spring5webapp.repositories.BooksInterface;

@Controller
public class booksController {

    @Autowired
    private BooksInterface booksInterface;

    @RequestMapping("/books")
    public  String getBooks(Model model){
        model.addAttribute("books",booksInterface.findAll());
        return "books";

    }

}
