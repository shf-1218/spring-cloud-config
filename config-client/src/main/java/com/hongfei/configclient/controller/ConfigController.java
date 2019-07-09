package com.hongfei.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hongfei.shen
 * @date 2019/07/09
 */
@RestController
public class ConfigController {
    @Value("${info.from}")
    private String from;

    @GetMapping("/info")
    public String info() {
        System.out.println(from);
        return from;
    }
}
