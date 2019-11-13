package org.michaelcs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Classname HelloController
 * @Description TODO
 * @Date 11/12/2019 5:23 PM
 * @Created by MichaelCS
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println("hello world");
        return "hello spring boot !";
    }
}
