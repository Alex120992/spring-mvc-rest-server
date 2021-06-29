package ru.zateev.spring.rest.dao;


import ru.zateev.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDao {
     List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

     Employee getEmployee(int id);

    void deletEmployee(int id);
}
