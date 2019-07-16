package com.stackroute;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class LoginController {

    @RequestMapping("login")
    public ModelAndView login(HttpServletRequest req, HttpServletResponse res)
    {
        String username =req.getParameter("first");
        String password = req.getParameter("second");

        User user = new User(username, password);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login");

        mv.addObject("output", username);
        return mv;
    }

}