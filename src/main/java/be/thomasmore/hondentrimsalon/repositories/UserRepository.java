package be.thomasmore.hondentrimsalon.repositories;

import be.thomasmore.hondentrimsalon.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
