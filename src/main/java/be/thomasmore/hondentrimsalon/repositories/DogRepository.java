package be.thomasmore.hondentrimsalon.repositories;

import be.thomasmore.hondentrimsalon.model.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DogRepository extends CrudRepository<Dog, Integer> {
    @Query("SELECT d FROM Dog d WHERE" +
            "(?1 IS NULL) OR (UPPER(d.name) LIKE (UPPER(CONCAT('%', ?1, '%')))) AND" +
            "(?2 IS NULL) OR (UPPER(d.age) LIKE (UPPER(CONCAT('%', ?2, '%')))) AND" +
            "(?3 IS NULL) OR (UPPER(d.fur.furType) LIKE (UPPER(CONCAT('%', ?3, '%')))) AND" +
            "(?4 IS NULL) OR (UPPER(d.breed.BreedName) LIKE (UPPER(CONCAT('%', ?4, '%'))))")
    List<Dog> findByFilter(String name, String age, String fur, String breed);
}
