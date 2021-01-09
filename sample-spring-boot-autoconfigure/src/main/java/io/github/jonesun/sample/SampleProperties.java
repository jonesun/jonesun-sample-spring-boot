package io.github.jonesun.sample;

import org.springframework.boot.context.properties.ConfigurationProperties;

import static io.github.jonesun.sample.SampleProperties.DEFAULT_PREFIX;

/**
 * 配置属性
 *
 * Spring Boot官方也对注释进行了一些规则约束：
 *
 * - 不要以“The”或“A”开头描述。
 * - 对于boolean类型，请使用“Whether" 或“Enable”开始描述。
 * - 对于基于集合的类型，请使用“Comma-separated list”
 * - 如果默认时间单位不等同于毫秒，则使用java.time.Duration而不是long描述默认单位，例如“如果未指定持续时间后缀，则将使用秒”。
 * - 除非必须在运行时确定，否则不要在描述中提供默认值
 * @author jone.sun
 * @date 2021-01-09 10:29
 */
@ConfigurationProperties(value = DEFAULT_PREFIX)
public class SampleProperties {

    /**
     * PREFIX
     */
    public static final String DEFAULT_PREFIX = "io.github.jonesun.sample";

    public static final String DEFAULT_ID = "1";

    public static final String DEFAULT_IP = "127.0.0.1";

    /**
     * ID标识
     */
    private String id;

    /**
     * IP地址
     */
    private String ip;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
