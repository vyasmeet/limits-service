package com.vyasmeet.springmicroservices.limitsservice.controller;
import com.vyasmeet.springmicroservices.limitsservice.bean.Limits;
import com.vyasmeet.springmicroservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LimitsController {
    @Autowired
    private Configuration config;

    @GetMapping("/limits")
    public Limits getAllLimits() {
//         return new Limits(1,1000);
        return new Limits(config.getMinimum(), config.getMaximum());
    }
}
