package com.jc.springboot.app;

import com.jc.springboot.app.controller.EmployeeController;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication

public class App {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);

        var employeeController = context.getBean(EmployeeController.class);
        System.out.println(employeeController.helloFromEmployeeService());
        System.out.println(employeeController.helloFromCustomerService());


    }
}
