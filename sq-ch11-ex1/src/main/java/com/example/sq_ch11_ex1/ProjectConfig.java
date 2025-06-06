package com.example.sq_ch11_ex1;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(
        basePackages = {"com.example.sq_ch11_ex1.clients"}
)
public class ProjectConfig {
}
