package webscanner.repositories;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	Iterable<Employee> findByFirstName(String string);
	

}
