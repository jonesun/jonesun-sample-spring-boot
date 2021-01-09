package io.github.jonesun.sample.service;

import io.github.jonesun.sample.ConfigureInfo;

/**
 * 业务接口
 *
 * @author jone.sun
 * @date 2021-01-09 10:30
 */
public interface SampleService {

    /**
     * 获取配置信息
     * @return {@link ConfigureInfo}
     */
    ConfigureInfo configureInfo();

}
