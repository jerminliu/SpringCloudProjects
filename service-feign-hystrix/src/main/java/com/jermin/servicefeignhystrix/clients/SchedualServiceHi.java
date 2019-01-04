package com.jermin.servicefeignhystrix.clients;

import com.jermin.servicefeignhystrix.clients.fallback.SchedualServiceHiHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Email s_zmliu@hotmail.com
 *
 * @author jerminliu
 * create 25 Dec 2018
 */
@FeignClient(value = "eurekaclient-service", fallback = SchedualServiceHiHystrix.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFormClientOne (@RequestParam(value = "name") String name);
}
