package com.rishabh.SpringBootWeb.BegineerProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @GetMapping("/index")
    public String index() {
        System.out.println("in home");
        return "index";
    }

}
