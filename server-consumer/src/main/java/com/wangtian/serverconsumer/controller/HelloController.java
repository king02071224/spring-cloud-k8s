package com.wangtian.serverconsumer.controller;

import com.wangtian.serverconsumer.feign.HelloApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangtian
 */
@RestController
public class HelloController {

    private final HelloApi helloApi;

    public HelloController(HelloApi helloApi) {
        this.helloApi = helloApi;
    }

    @GetMapping("hi")
    String hi(@RequestParam("id") String id) {
        return helloApi.hi(id);
    }
}
