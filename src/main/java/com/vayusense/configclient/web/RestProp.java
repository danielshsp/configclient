package com.vayusense.configclient.web;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class RestProp {

    @Value("${message}")
    private String message;

    @GetMapping(value = "/test")
    public String testMessage(){
        return "test"+message;
    }
}
