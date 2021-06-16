package be.thomasmore.hondentrimsalon.repositories;

import be.thomasmore.hondentrimsalon.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{
}
