package io.github.jonesun.sample.service.impl;

import io.github.jonesun.sample.ConfigureInfo;
import io.github.jonesun.sample.service.SampleService;

/**
 * 业务逻辑实现
 *
 * @author jone.sun
 * @date 2021-01-09 10:31
 */
public class SampleServiceImpl implements SampleService {

    private String id;

    private String ip;

    public SampleServiceImpl(String id, String ip) {
        this.id = id;
        this.ip = ip;
    }

    @Override
    public ConfigureInfo configureInfo() {
        return new ConfigureInfo(id, ip);
    }
}
