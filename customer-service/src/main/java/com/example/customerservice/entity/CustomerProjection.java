package com.example.customerservice.entity;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullProjection" , types = Customer.class)
public interface CustomerProjection {

    public Long getId();
    public String getName();
}
