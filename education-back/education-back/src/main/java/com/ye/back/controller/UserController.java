package com.ye.back.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hjy
 * @since 2023-03-10
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @CrossOrigin
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test() {
        return "test 接口测试";
    }

    @CrossOrigin
    @RequestMapping(value = "/test2",method = RequestMethod.GET)
    public String test2() {
        return "测试接口二 ...";
    }

}
