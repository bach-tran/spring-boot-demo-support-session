package com.revature.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController // @RestController is the same as @Controller except we don't need to annotate our return type with @ResponseBody
public class DemoController {

    @GetMapping("/test")
    // @ResponseBody tells Spring Web to put the return value into the HTTP response body
    public /* @ResponseBody */ String getTest() {
        return "GET /test invoked";
    }

    @PostMapping("/test2")
    public String postTest() {
        return "POST /test2 invoked";
    }

    @DeleteMapping("/test3")
    public String deleteTest() {
        return "DELETE /test3 invoked";
    }

    @PutMapping("/test4")
    public String putTest() {
        return "PUT /test4 invoked";
    }

}
