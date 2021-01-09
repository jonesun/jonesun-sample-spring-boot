package io.github.jonesun.sample.test.controller;

import io.github.jonesun.sample.ConfigureInfo;
import io.github.jonesun.sample.service.SampleService;
import io.github.jonesun.sample.test.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jone.sun
 * @date 2021-01-09 11:13
 */
@RestController
public class SampleController {

    @Autowired
    SampleService sampleService;

    @GetMapping(value = "config")
    public Result configInfo() {
        // 获取配置信息
        ConfigureInfo configureInfo = sampleService.configureInfo();
        // 封装返回
        return Result.ok(configureInfo);
    }

}
