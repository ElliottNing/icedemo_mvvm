package com.example.demo.controller;

import com.example.demo.mapper.DemoMapper;
import com.example.demo.model.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private DemoMapper demoMapper;

    @RequestMapping("/hello")
    public String index() {
        List<Demo> list = demoMapper.selectAll();
        return "Hello World";
    }
}
