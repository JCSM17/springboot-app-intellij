package com.jc.springboot.app.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public String hello() {
        return "Hola Mundo!";
    }
}
