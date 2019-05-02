package sk.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import sk.springframework.spring5webapp.model.books;


public interface BooksInterface extends CrudRepository<books,Long> {
}
