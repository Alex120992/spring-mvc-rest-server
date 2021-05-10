package ru.zateev.spring.rest.dao;


import ru.zateev.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    public List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    void deletEmployee(int id);
}
