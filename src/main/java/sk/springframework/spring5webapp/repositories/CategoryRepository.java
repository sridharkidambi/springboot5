package sk.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import sk.springframework.spring5webapp.model.category;

public interface CategoryRepository extends CrudRepository<category, Long> {
}
