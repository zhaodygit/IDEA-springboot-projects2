package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 用户登录请求
     * @param request
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public Object login(HttpServletRequest request) {
        //将用户的信息存放到session中
        User user = new User();
        user.setId(1001);
        user.setUsername("zhangsan");
        request.getSession().setAttribute("user", user);

        return "login SUCCESS";
    }

    /**
     * 该请求用户登录之后才可访问
     * @return
     */
    @RequestMapping("/center")
    @ResponseBody
    public Object center() {

        return  "See center Message";
    }

    //不登录也可访问
    @RequestMapping("/out")
    @ResponseBody
    public Object out() {
        return "Out see anytime";
    }

    /**
     * 如果用户访问了需要登录的请求， 之后会跳转至该请求
     * @return
     */
    @RequestMapping("/error")
    @ResponseBody
    public Object error() {
        return "error";
    }
}
