package com.legend.microservice.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("service的API接口")
@RestController
@RequestMapping("/service4")
public class ZipkinBraveController {


    @ApiOperation("trace第三步")
    @RequestMapping("/test")
    public String service4() throws Exception {
        Thread.sleep(300);
        return "service4";
    }

} 