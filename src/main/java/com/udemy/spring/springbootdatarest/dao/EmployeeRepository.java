package com.udemy.spring.springbootdatarest.dao;


import com.udemy.spring.springbootdatarest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
        public List<Employee> findAllByName(String name);

        public List<Employee> findAllBySalaryBetween(int low, int high);
}
