package sk.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import sk.springframework.spring5webapp.model.category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<category, Long> {

    @Override
    Optional<category> findById(Long aLong);

    Optional<category> findByDesc(String desc);
}
