package com.soft1851.oauth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 28165
 */
@RestController
public class LoginController{
    @RequestMapping("/index")
    public String simpleIndex(){
        return "index";
    }

}
