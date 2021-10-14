package com.yy.filecloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: elvis.yue@i9i8.com
 * @create: 2021-10-14 15:38
 */
@Controller
public class BaseController {
    @RequestMapping("/file/all")
    String all(ModelAndView modelAndView){
        return "index";
    }
}