package be.thomasmore.hondentrimsalon.repositories;

import be.thomasmore.hondentrimsalon.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
