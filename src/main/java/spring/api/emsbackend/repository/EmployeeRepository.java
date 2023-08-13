package spring.api.emsbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.api.emsbackend.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee , Long> {

}
