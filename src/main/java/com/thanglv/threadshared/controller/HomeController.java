package com.thanglv.threadshared.controller;

import com.thanglv.threadshared.config.Ball;
import com.thanglv.threadshared.config.BallFactory;
import com.thanglv.threadshared.config.BallFactory2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author thanglv on 6/28/2021
 * @project thread-shared
 */
@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public Ball testSingle() {
        return BallFactory.getInstance();
    }

    @GetMapping("/v2")
    public Ball testV2() {
        return BallFactory2.getInstance();
    }
}
