package com.darrenforsythe.service;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/my-api")
public class ServiceController {

    @GetMapping(value = "/details", produces = MediaType.APPLICATION_JSON_VALUE)
    public ServiceResponse getServiceResponse() {
        return new ServiceResponse("foo", "bar");
    }

    @PostMapping(
            value = "/details",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ServiceResponse postServiceDetails(@RequestBody ServiceResponse serviceResponse) {
        return new ServiceResponse(
                serviceResponse.getHello() + "1", serviceResponse.getWorld() + "2");
    }
}
