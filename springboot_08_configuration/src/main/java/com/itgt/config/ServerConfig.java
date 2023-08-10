package com.itgt.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
@Component
@Validated
@ConfigurationProperties(prefix = "servers")
public class ServerConfig {
    private String ipAddress;
    @Max(value = 8888,message = "最大值不能超过8888")
//    @Min(value = 20,message = "最小值不能超过202")
    private int port;
    private long timeout;
}
