package io.github.jonesun.sample;

import io.github.jonesun.sample.service.SampleService;
import io.github.jonesun.sample.service.impl.SampleServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Objects;

import static io.github.jonesun.sample.SampleProperties.DEFAULT_ID;
import static io.github.jonesun.sample.SampleProperties.DEFAULT_IP;

/**
 * 自动配置类
 *
 * @author jone.sun
 * @date 2021-01-09 10:28
 */
@Configuration
@EnableConfigurationProperties(value = SampleProperties.class)
public class SampleAutoConfigure {

    private Logger logger = LoggerFactory.getLogger(SampleAutoConfigure.class);

    @Autowired
    public SampleProperties properties;

    /**
     * 配置ExampleService
     *
     * @return {@link SampleService}
     */
    @Bean
    @ConditionalOnMissingBean
    public SampleService sampleService() {
        //当容器中没有指定bean时，创建此bean
        logger.info("Config SampleService Start...");
        String id = properties.getId();
        if(Objects.isNull(id)) {
            id = DEFAULT_ID;
        }
        String ip = properties.getIp();
        if(Objects.isNull(ip)) {
            ip = DEFAULT_IP;
        }
        SampleServiceImpl service = new SampleServiceImpl(id, ip);
        logger.info("Config SampleService End.");
        return service;
    }

}
