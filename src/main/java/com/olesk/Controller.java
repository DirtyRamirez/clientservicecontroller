package com.olesk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private Environment environment;

    @Autowired
    private SimpleControllerServiceProxy simpleControllerServiceProxy;


    @GetMapping("/client")
    public String convertCurrencyFeign() {

        String response = simpleControllerServiceProxy.retrieveSampleValue();
        return "Client port " + environment.getProperty("local.server.port") + " " + response;
    }

}
