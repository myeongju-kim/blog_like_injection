package com.example.demo.utils.aspects;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Arrays;
import java.util.stream.Collectors;

@Aspect
@Component
@Slf4j
public class LogAspect {

    private static final String ANNOTATION_PATH = "@annotation(com.example.demo.utils.annotations.Log)";

    @Before(ANNOTATION_PATH)
    public void loggingBefore(JoinPoint joinPoint) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        log.info("[API REQUEST] {} {}, Payload: {}", request.getMethod(), request.getRequestURI(), getPayload(joinPoint));
    }

    @AfterReturning(value = ANNOTATION_PATH, returning = "result")
    public void afterReturn(Object result) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        log.info("[API RESPONSE] {} {}, Result: {}", request.getMethod(), request.getRequestURI(), result.toString());
    }
//    @AfterThrowing

    private String getPayload(JoinPoint joinPoint) {
        return Arrays.stream(joinPoint.getArgs())
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }
}
