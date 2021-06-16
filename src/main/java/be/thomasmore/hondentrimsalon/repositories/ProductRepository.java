package be.thomasmore.hondentrimsalon.repositories;

import be.thomasmore.hondentrimsalon.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
