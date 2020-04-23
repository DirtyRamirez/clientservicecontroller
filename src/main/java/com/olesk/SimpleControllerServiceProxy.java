package com.olesk;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "controller-service")
@RibbonClient(name = "controller-service")
public interface SimpleControllerServiceProxy {

    @GetMapping("/api/value")
    public String retrieveSampleValue();
}