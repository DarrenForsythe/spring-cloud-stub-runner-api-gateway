package com.darrenforsythe.service;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ServiceResponse {

    @JsonCreator
    public ServiceResponse(
            @JsonProperty("hello") String hello, @JsonProperty("World") String world) {
        this.hello = hello;
        this.world = world;
    }

    private final String hello;
    private final String world;
}
