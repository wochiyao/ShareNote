package com.wochiyao.sharenote.controller;

import com.wochiyao.sharenote.bean.User;
import com.wochiyao.sharenote.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }
    @PostMapping("/login")
    public String login(User user, Model model, HttpSession httpSession){
        if(userService.queryUser(user)!=null){
            httpSession.setAttribute("user",user);
            return "redirect:";
        }else {
            model.addAttribute("msg","登录失败");
            return "login";
        }
    }
    @GetMapping("/register")
    public String registerPage(){
        return "register";
    }
    @PostMapping("/register")
    public String register(User user, Model model){
        if (userService.insertUser(user)==1){
            model.addAttribute("msg","注册成功，请登录");
            return "login";
        }else{
            model.addAttribute("msg","注册失败");
            return "register";
        }
    }
}
