package com.zd.demo.controller;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author tqx
 * @CreateDate 2021/5/27
 * @Description TODO
 */
@RestController
public class HelloWorldController {
    @ApiModelProperty
    @RequestMapping("hello")
    public String HelloWorld() {
        return "hello";
    }
}
