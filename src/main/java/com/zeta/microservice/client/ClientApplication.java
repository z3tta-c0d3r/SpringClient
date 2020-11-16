package com.zeta.microservice.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }
}

@RefreshScope
@RestController
class MessageRestController {

    @Value("${sample:sample SC default}")
    private String message;

    @RequestMapping("/sample")
    String getMessage() {
        return this.message;
    }
}
