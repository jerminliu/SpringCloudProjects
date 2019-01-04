package com.jermin.serviceribbonhystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Email s_zmliu@hotmail.com
 *
 * @author jerminliu
 * crate 25 Dec 2018
 */
@Service
public class HiHystrixService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiHystrixService (String name) {
        return restTemplate.getForObject("http://eurekaclient-service/hi?name=" + name, String.class);
    }

    public String hiError(String name) {
        return "hi, " + name + ", sorry, error !";
    }
}
