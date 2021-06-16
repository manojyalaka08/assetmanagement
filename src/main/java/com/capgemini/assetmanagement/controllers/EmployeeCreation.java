package com.capgemini.assetmanagement.controllers;

import com.capgemini.assetmanagement.models.Employee;
import com.capgemini.assetmanagement.repositories.EmployeeRepository;
import com.capgemini.assetmanagement.requests.EmployeeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping("/employee")
public class EmployeeCreation {

    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping(value = "/hello1", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String helloWorld1(@RequestBody EmployeeRequest employeeRequest){

        String employeeName = employeeRequest.getEmployeeName();
        String userId = employeeRequest.getUserId();
        String password = employeeRequest.getPassword();

        Employee employee = new Employee();
        employee.setEmployeeName(employeeName);
        employee.setUserName(userId);
        employee.setPassword(password);

        employeeRepository.save(employee);

        return "Hello " + employeeRequest.getEmployeeName() + " you are enrolled" + employeeRepository.findAllByEmployeeName("Rohan2");
    }
    @GetMapping(value = "/hello2", produces = "application/json")
    public String helloWorld2(){
        return "Helloworld employee1";
    }
    @GetMapping(value = "/hello3", produces = "application/json")
    public String helloWorld3(){
        return "Helloworld employee2";
    }
}
