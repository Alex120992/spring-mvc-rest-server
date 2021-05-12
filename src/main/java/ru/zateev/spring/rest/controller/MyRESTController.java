package ru.zateev.spring.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.zateev.spring.rest.entity.Employee;
import ru.zateev.spring.rest.exception_handling.NoSuchEmployeeException;
import ru.zateev.spring.rest.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/")
public class MyRESTController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        List<Employee> allEmployees = employeeService.getAllEmployees();


        return allEmployees;

    }

    /* В фигурных скобках мы делаем pathVariable для передачи id из url
     * Который передаем в метод с помощью аннотации PathVariable
     * Это переменная получаем */
    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable Integer id) {
        Employee employee = employeeService.getEmployee(id);
        if (employee == null) {
            throw new NoSuchEmployeeException("Нет такого работника в БД с id " + id);
        }
        return employee;
    }

    @PostMapping("/employees")
    public Employee addNewEmployee (@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return employee;
    }

    @PutMapping ("/employees")
    public Employee updateEmployee (@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return employee;
    }

}
