package com.crudproject.codedecode.repos;

import com.crudproject.codedecode.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeCrudRepo extends JpaRepository<Employee, Long>{

}
