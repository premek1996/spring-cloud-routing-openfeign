package com.example.feignclient.client.feign;

import com.example.feignclient.server.model.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "employee", url = "${employees.url}")
public interface EmployeeClient {

    @GetMapping
    List<Employee> getEmployees();

}
