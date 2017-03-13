package com.jg.portal.controller;

import com.jg.Service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017-03-12.
 */
@RequestMapping("login")
@Controller("loginController")
public class LoginController {
   // LoginController login = new LoginController();
   private final static Logger log = LoggerFactory.getLogger(LoginController.class);

    public LoginController() {
    log.debug("LoginController is created");
    }

    @Autowired
    private MemberService memberservice;
    @RequestMapping(value={"","index","index.html"})
    public String index(){

     return "index.jsp";
    }

}
