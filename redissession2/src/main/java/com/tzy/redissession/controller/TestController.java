package com.tzy.redissession.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @RequestMapping("/setUrl")
    public Map<String,Object> setUrl(HttpServletRequest request){
        request.getSession().setAttribute("url", request.getRequestURL());
        Map<String,Object> map = new HashMap<>();
        map.put("url", request.getRequestURL());
        return map;
    }

    @RequestMapping("/getSession")
    public Map<String,Object> getSession(HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        map.put("sessionId", request.getSession().getId());
        map.put("url", request.getSession().getAttribute("url"));
        return map;
    }

}
