/*
 * Copyright (c) 2019.
 * Made by jjwonyop
 */

package com.example.demorests.configs;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanRegister {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
