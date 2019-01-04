package com.jermin.servicefeignhystrix.clients.fallback;

import com.jermin.servicefeignhystrix.clients.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * Email s_zmliu@hotmail.com
 *
 * @Author Jermin
 * create 25 Dec 2018
 */
@Component
public class SchedualServiceHiHystrix implements SchedualServiceHi {

    @Override
    public String sayHiFormClientOne(String name) {
        return "Sorry " + name + ", Service is down~";
    }
}
