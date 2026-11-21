package com.HMS.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {
    @Value("${ENV_VALUE}")
    private String value;
    @GetMapping
    public Map<String,String> test(){
        Map<String,String> map = new HashMap<>();
        map.put("env_value",value);
        return map;
    }
}
