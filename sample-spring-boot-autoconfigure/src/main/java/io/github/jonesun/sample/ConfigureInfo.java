package io.github.jonesun.sample;

/**
 * 配置信息
 *
 * @author jone.sun
 * @date 2021-01-09 10:30
 */
public class ConfigureInfo {

    /**
     * ID
     */
    private String id;

    /**
     * ip
     */
    private String ip;

    public ConfigureInfo() {
    }

    public ConfigureInfo(String id, String ip) {
        this.id = id;
        this.ip = ip;
    }

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
