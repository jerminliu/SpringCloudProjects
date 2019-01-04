package com.jermin.serviceribbonhystrix.web;

import com.jermin.serviceribbonhystrix.service.HiHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Email s_zmliu@hotmail.com
 *
 * @author jerminliu
 * create 25 Dec 2018
 */
@RestController
public class HiHystrixController {
    @Autowired
    HiHystrixService hiHystrixService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {

        System.out.println("ribbon-hystrix");
        return hiHystrixService.hiHystrixService(name);
    }

    //@GetMapping(value = "/hello")
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam String name) {
        return hiHystrixService.hiHystrixService(name);
    }
}