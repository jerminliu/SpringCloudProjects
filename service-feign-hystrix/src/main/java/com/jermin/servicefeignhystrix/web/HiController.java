package com.jermin.servicefeignhystrix.web;

import com.jermin.servicefeignhystrix.clients.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Email s_zmliu@hotmail.com
 *
 * @author jerminliu
 * create 25 Dec 2018
 */

@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi (@RequestParam String name) {
        System.out.println("Feign-hystrix");
        return schedualServiceHi.sayHiFormClientOne(name);
    }

}
