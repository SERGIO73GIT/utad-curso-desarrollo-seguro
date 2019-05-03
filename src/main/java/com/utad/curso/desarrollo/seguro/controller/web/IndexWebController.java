package com.utad.curso.desarrollo.seguro.controller.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.HtmlUtils;

@Controller
public class IndexWebController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/")
    public String index(
            @RequestParam(name = "name", required = false, defaultValue = "World") String name,
            Model model) {
        model.addAttribute("name", HtmlUtils.htmlEscape(name));
        return "index.jsp";

    }
}
