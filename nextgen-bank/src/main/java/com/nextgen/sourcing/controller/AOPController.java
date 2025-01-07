package com.nextgen.sourcing.controller;

import com.nextgen.sourcing.service.HeartBeatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AOPController {

    private final HeartBeatService heartBeatService;

    @GetMapping(path = "/testAOP")
    ResponseEntity<String> testAOP(){
        heartBeatService.testAOP();
        return new ResponseEntity<>("Successfully tested AOP", HttpStatus.OK);
    }

}
