package com.yy.filecloud.controller;

import com.yy.filecloud.core.system.ShellExecutor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SystemProcess {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    void test(){
        List<String> comments=new ArrayList<>();
        comments.add("echo \"start...\"\n");
        comments.add("mkdir /usr/test\n");
        ShellExecutor.runShell(comments);
    }
}
