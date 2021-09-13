package com.prodian.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodian.demo.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}