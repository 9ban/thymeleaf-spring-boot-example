package com.nban.expression.web;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liyi on 2016/2/26.
 */
@Controller
@RequestMapping
public class ExpressionController {

    @RequestMapping(value="index")
    public String index(Model model){
        model.addAttribute("li","var");
        return "expression";
    }
}
