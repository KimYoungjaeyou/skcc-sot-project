package com.skcc.lazybook.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  
 * @author Koo MinJeong
 * @since 1.0
 * 
 */
@RestController
public class HomeController {

    @RequestMapping(value = { "", "/" })
    public String index() {
        return "index";
    }

}