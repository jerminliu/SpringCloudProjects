package com.jermin.myfirstspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController  //same as @Controller + @ResponseBody
public class HelloController {

    @RequestMapping(value = {"/hello", "/hi"}, method = RequestMethod.GET)
    public String sayHelloorHi (@RequestParam String name) {
        return "Hi, " + name + ", how are you!!!";
    }

    @Autowired
    private GirlProperties girlProperties;

    //Use Properties values
    @RequestMapping(value = {"/sayhello"}, method = RequestMethod.GET)
    public String sayHell () {
        return "Hello, " + girlProperties.getName() + ", Your age is " + girlProperties.getAge();
    }
}
