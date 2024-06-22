package com.ironhack.doctorsandpatientspart2.repository;

import com.ironhack.doctorsandpatientspart2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
