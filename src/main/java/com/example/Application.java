package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@SpringBootApplication
@RestController
@Tag(name = "Main", description = "Main endpoints")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Operation(summary = "Hello endpoint", description = "Returns a greeting message")
    @GetMapping("/")
    public String hello() {
        return "Hello from GitOps CI/CD!";
    }

    @Operation(summary = "Health check", description = "Returns OK when healthy")
    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}