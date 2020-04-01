package com.wangtian.serverprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangtian
 */
@RestController
public class HelloController {

    @GetMapping("hi")
    public String hi(String id) {
        return id;
    }
}
