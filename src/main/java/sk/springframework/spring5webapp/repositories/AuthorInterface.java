package sk.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import sk.springframework.spring5webapp.model.author;


public interface AuthorInterface extends CrudRepository<author,Long> {
}
