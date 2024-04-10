package com.jc.springboot.app.controller;

import com.jc.springboot.app.primary.CustomerService;
import com.jc.springboot.app.service.EmployeeService;
import com.jc.springboot.app.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private CustomerService customerService;


    // Generado el constructor
    public EmployeeController(EmployeeService employeeService, CustomerService customerService) {
        this.employeeService = employeeService;
        this.customerService = customerService;
    }

    public String helloFromEmployeeService() {
        return this.employeeService.hello();
    }

    public String helloFromCustomerService() {
        return this.customerService.hello();
    }
}
