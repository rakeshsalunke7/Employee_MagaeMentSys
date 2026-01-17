package com.rms.EmployeeManagement.repository;

import com.rms.EmployeeManagement.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
