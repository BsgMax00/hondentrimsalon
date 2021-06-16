package be.thomasmore.hondentrimsalon.repositories;

import be.thomasmore.hondentrimsalon.model.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Integer> {
}
