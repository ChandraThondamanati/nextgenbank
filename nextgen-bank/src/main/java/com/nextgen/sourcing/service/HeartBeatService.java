package com.nextgen.sourcing.service;

import com.nextgen.sourcing.annotation.SendHeartbeat;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HeartBeatService {
    @SendHeartbeat
    public void testAOP(){
        System.out.println("inside testAOP");
    }
}
