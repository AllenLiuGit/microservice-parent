package com.legend.microservice.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("service的API接口")
@RestController
@RequestMapping("/service3")
public class ZipkinBraveController {


    @ApiOperation("trace第三步")
    @RequestMapping("/test")
    public String service3() throws Exception {
        Thread.sleep(300);
        return "service3";
    }

} 