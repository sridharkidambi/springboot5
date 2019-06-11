package sk.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import sk.springframework.spring5webapp.model.category;

public interface UnitOfMeasure extends CrudRepository<category, Long> {
}
