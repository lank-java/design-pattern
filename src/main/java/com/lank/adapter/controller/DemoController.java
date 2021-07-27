package com.lank.adapter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author lank
 * @since 2021/7/28 0:48
 */
@Controller
public class DemoController implements org.springframework.web.servlet.mvc.Controller {

    @GetMapping("/test")
    public String demo(){
        return "ok";
    }

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return null;
    }
}
