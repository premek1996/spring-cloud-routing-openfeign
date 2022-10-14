package com.example.feignclient.server.controller;

import com.example.feignclient.server.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("server/api/v1/employees")
public class EmployeeController {

    @GetMapping
    List<Employee> getEmployees() {
        return List.of(
                Employee.builder()
                        .name("name1")
                        .age(25)
                        .build(),
                Employee.builder()
                        .name("name2")
                        .age(30)
                        .build()
        );
    }

}
