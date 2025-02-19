package com.jc.springboot.app.config;

import com.jc.springboot.app.primary.CustomerAServiceImpl;
import com.jc.springboot.app.primary.CustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:beans.xml")
public class BeansConfig {
    /*
    Esta opcion se usa para configurar clases que provienen de frameworks externos
     */
    @Bean
    public CustomerService customerService() {
        return new CustomerAServiceImpl();
    }
}
