package com.example.demo;

import org.springframework.web.bind.annotation.*;

/**
 * @author : ThinkStu
 * @since : 2023/5/4, 10:23, 周四
 **/
@RequestMapping("/")
@RestController
public class TestController {
    @GetMapping("/")
    String test() {
        return "hello world";
    }
}
