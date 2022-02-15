package com.wm.servicefeign.controller;

import com.wm.servicefeign.service.feign.ServiceHiByFeign;
import com.wm.servicefeign.service.ribbon.ServiceHiByRibbon;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 描述:
 *
 * @auther WangMin
 * @create 2022-02-13 0:12
 */
@RestController
public class HiController {

    @Resource
    private ServiceHiByRibbon serviceHiByRibbon;
    @Resource
    private ServiceHiByFeign serviceHiByFeign;

    //通过ribbon去调用其他服务
    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return serviceHiByRibbon.hiserviceByRibbon( name );
    }

    //通过feign去调用其他服务
    @GetMapping(value = "/hi2")
    public String hi2(@RequestParam String name) {
        return serviceHiByFeign.getHiFromServiceHi(name);
    }

}