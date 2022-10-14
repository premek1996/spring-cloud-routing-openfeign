package com.example.feignclient.client.controller;

import com.example.feignclient.client.feign.EmployeeClient;
import com.example.feignclient.server.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("client/api/v1/employees")
@RequiredArgsConstructor
public class EmployeeControllerClient {

    private final EmployeeClient employeeClient;

    @GetMapping
    List<Employee> getEmployees() {
        return employeeClient.getEmployees();
    }

}
