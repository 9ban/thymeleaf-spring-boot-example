package com.nban.expression.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by liyi on 2016/2/26.
 */
@Controller
@RequestMapping
public class ExpressionController {

    @RequestMapping(value="index")
    public String index(Model model){
        model.addAttribute("li","I'm var");
        model.addAttribute("current",new Date());
        return "expression";
    }

}
