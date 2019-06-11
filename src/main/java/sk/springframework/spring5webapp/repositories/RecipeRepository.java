package sk.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import sk.springframework.spring5webapp.model.Receipe;

import javax.persistence.Id;

public interface RecipeRepository extends CrudRepository<Receipe, Long> {
}
