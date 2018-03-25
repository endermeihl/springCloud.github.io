package com.ender.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("service-hi2")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();

}