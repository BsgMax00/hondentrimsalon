package be.thomasmore.hondentrimsalon.repositories;

import be.thomasmore.hondentrimsalon.model.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface CustomerRepository extends CrudRepository<Customer, Integer>{
    @Query("SELECT c FROM Customer c WHERE " +
            "(:keyword IS NULL) OR (UPPER(c.name) LIKE UPPER(CONCAT('%', :keyword, '%')))")
    List<Customer> findByFilter(@Param("keyword") String keyword);
}
