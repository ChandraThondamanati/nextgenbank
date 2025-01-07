package com.nextgen.sourcing.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SendHeartbeatAdvice {
    @Before("@annotation(com.nextgen.sourcing.annotation.SendHeartbeat)")
    public void testHeartBeat(){
        System.out.println("Entered inside ");

    }
}
