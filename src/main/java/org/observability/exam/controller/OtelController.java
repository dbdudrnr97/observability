package org.observability.exam.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class OtelController {
    private static final Logger logger = LoggerFactory.getLogger(OtelController.class);

    @GetMapping("/hello")
    public String hello(@RequestParam("anyString") Optional<String> anyString){
        logger.info("[{}] , 요청 받음 !! ", anyString.toString());
        return anyString.toString();
    }
}
